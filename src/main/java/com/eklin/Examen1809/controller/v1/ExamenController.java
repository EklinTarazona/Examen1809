package com.eklin.Examen1809.controller.v1;

import com.eklin.Examen1809.response.ExamenResponse;
import com.eklin.Examen1809.response.ExamenStatus;
import com.eklin.Examen1809.response.IndexResponse;
import com.eklin.Examen1809.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examen/v1")
public class ExamenController {
	
	@Autowired
	private ExamenService service;
	
	@GetMapping({"/", ""})
	/*public IndexResponse index(){
		
		return service.index();
	}*/
	public ExamenResponse<IndexResponse> index(){
		ExamenResponse<IndexResponse> response =new ExamenResponse<>();
		response.setData(service.index());
		response.setStatus(ExamenStatus.builder().code("0000").message("ejecutadocon exito").build());
		return response;
	}
}
