package com.eklin.Examen1809.service.Impl;

import com.eklin.Examen1809.response.IndexResponse;
import com.eklin.Examen1809.service.ExamenService;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceImpl implements ExamenService {
	@Override
	public IndexResponse index() {
		System.out.println("Invocando a index de examen");
		StringBuilder str = new StringBuilder().append("Invocando").append(" a ").append("index");
		return IndexResponse.builder().code("0000").message(str.toString()).build();
	}
}
