package com.eklin.Examen1809.repository.Impl;

import com.eklin.Examen1809.exception.ClientExistException;
import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.model.Client;
import com.eklin.Examen1809.repository.ClientRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ClientRepositoryImpl implements ClientRepository {
	
	public final Map<Long, Client> data;
	ClientRepositoryImpl(){
		this.data = new HashMap<>();
	}
	
	@Override
	public void add(Client client) throws ClientExistException {
		if(this.data.containsKey(client.getClientCel())){
			throw new ClientExistException("El cliente ya existe!!");
		}
		this.data.put(client.getClientCel(), client);
	}
	
	@Override
	public void edit(Client client) throws ClientNotExistException {
		if(!this.data.containsKey(client.getClientCel())){
			throw new ClientNotExistException("El cliente no existe!!");
		}
		this.data.put(client.getClientCel(), client);
	}
	
	@Override
	public void remove(Long clientCel) {
		this.data.remove(clientCel);
	}
	
	@Override
	public List<Client> list() {
		return this.data.entrySet().stream().map(row ->row.getValue()).collect(Collectors.toList());
	}
}
