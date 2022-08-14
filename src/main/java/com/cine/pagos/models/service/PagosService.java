package com.cine.pagos.models.service;


import com.cine.pagos.models.Socio;
import com.cine.pagos.response.EstadoSocioResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface PagosService {


	ResponseEntity<Socio> getSocio(String codCliente);

}
