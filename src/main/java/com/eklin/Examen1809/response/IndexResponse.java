package com.eklin.Examen1809.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IndexResponse {
	private String message;
	private String code;
	//arrastrando error
}
