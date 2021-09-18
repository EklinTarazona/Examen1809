package com.eklin.Examen1809.controller.v1;

import com.eklin.Examen1809.exception.ClientExistException;
import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.model.Client;
import com.eklin.Examen1809.request.ClientDelRequest;
import com.eklin.Examen1809.request.ClientRequest;
import com.eklin.Examen1809.response.ExamenResponse;
import com.eklin.Examen1809.response.ExamenStatus;
import com.eklin.Examen1809.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/v1")
public class ClientController {
	@Autowired
	private ClientService service;
	
	@PostMapping
	public ExamenResponse add(@RequestBody ClientRequest beanReq) throws ClientExistException {
		service.add(beanReq);
		ExamenResponse<?> response =new ExamenResponse<>();
		response.setStatus(new ExamenStatus("0000", "Exito al ajecutar"));
		return response;
	}
	
	@PutMapping
	public ExamenResponse edit(@RequestBody ClientRequest beanReq) throws ClientNotExistException{
		service.edit(beanReq);
		ExamenResponse<?> response =new ExamenResponse<>();
		response.setStatus(new ExamenStatus("0000", "Exito al ajecutar"));
		return response;
	}
	
	@DeleteMapping
	public ExamenResponse remove(@RequestBody ClientDelRequest beanReq){
		service.remove(beanReq);
		ExamenResponse<?> response =new ExamenResponse<>();
		response.setStatus(new ExamenStatus("0000", "Exito al ajecutar"));
		return response;
	}
	
	@GetMapping
	public ExamenResponse<List<Client>> list(){
		ExamenResponse<List<Client>> response = new ExamenResponse<>();
		response.setData(service.list());
		response.setStatus(new ExamenStatus("0000", "Exito al ejecutar"));
		return response;
	}
}
