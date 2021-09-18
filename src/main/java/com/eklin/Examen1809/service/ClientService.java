package com.eklin.Examen1809.service;

import com.eklin.Examen1809.exception.ClientExistException;
import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.model.Client;
import com.eklin.Examen1809.request.ClientDelRequest;
import com.eklin.Examen1809.request.ClientRequest;

import java.util.List;

public interface ClientService {
	public void add(ClientRequest client) throws ClientExistException;
	public void edit(ClientRequest client) throws ClientNotExistException;
	public void remove(ClientDelRequest clientCel);
	public List<Client> list();
}
