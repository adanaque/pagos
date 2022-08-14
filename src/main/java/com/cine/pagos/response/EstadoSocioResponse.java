package com.cine.pagos.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EstadoSocioResponse {
	String dni;
	String estado;
}
