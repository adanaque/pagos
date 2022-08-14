package com.cine.pagos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder

public class Socio {

	private String dni;
	private String nombre;
	private String paterno;
	private String materno;
	private String correo;
	private String telefono;
	private String estado;
	private String tipoMembresia;

}
