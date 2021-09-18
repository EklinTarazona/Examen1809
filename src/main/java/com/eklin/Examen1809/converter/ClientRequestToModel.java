package com.eklin.Examen1809.converter;

import com.eklin.Examen1809.model.Client;
import com.eklin.Examen1809.request.ClientRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClientRequestToModel implements Converter<ClientRequest, Client> {
	
	
	@Override
	public Client convert(ClientRequest source) {
		Client client =new Client();
		BeanUtils.copyProperties(source, client);
		return client;
	}
}
