package com.eklin.Examen1809.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExamenResponse <T>{
	private T data;
	ExamenStatus status;
}
