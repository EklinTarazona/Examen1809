package com.eklin.Examen1809.service.Impl;

import com.eklin.Examen1809.converter.ClientRequestToModel;
import com.eklin.Examen1809.exception.ClientExistException;
import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.model.Client;
import com.eklin.Examen1809.repository.ClientRepository;
import com.eklin.Examen1809.request.ClientDelRequest;
import com.eklin.Examen1809.request.ClientRequest;
import com.eklin.Examen1809.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private ClientRequestToModel clientRequestConverter;
	
	@Override
	public void add(ClientRequest client) throws ClientExistException {
			Client clientModel = clientRequestConverter.convert(client);
			repository.add(clientModel);
	}
	
	@Override
	public void edit(ClientRequest client) throws ClientNotExistException {
		repository.edit(clientRequestConverter.convert(client));
	}
	
	@Override
	public void remove(ClientDelRequest clientCel) {
		repository.remove(clientCel.getClientCel());
	}
	
	@Override
	public List<Client> list() {
		return repository.list();
	}
}
