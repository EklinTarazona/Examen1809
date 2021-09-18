package com.eklin.Examen1809.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	private Long clientCel;
	private String firstName;
	private String lastName;
	private String pass;
}
