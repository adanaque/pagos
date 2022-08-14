package com.cine.pagos.models.service;


import com.cine.pagos.clients.SociosFeignRest;
import com.cine.pagos.models.Socio;
import com.cine.pagos.models.dao.PagosDao;
import com.cine.pagos.response.EstadoSocioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PagosServiceFeignImpl implements PagosService {
	
	@Autowired
	private SociosFeignRest sociosFeignRest;


	@Override
	public ResponseEntity<Socio> getSocio(String codCliente) {
		return sociosFeignRest.getSocio(codCliente);
	}
}
