package com.eklin.Examen1809.repository;

import com.eklin.Examen1809.exception.ClientExistException;
import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.model.Client;

import java.util.List;

public interface ClientRepository {
	public void add(Client client) throws ClientExistException;
	public void edit(Client client) throws ClientNotExistException;
	public void remove(Long clientCel);
	public List<Client> list();
	
}
