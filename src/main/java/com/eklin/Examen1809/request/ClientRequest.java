package com.eklin.Examen1809.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
	private Long clientCel;
	private String firstName;
	private String lastName;
	private String pass;
}
