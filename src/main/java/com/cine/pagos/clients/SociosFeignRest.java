package com.cine.pagos.clients;

import com.cine.pagos.models.Socio;
import com.cine.pagos.response.EstadoSocioResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "man-socios")
public interface SociosFeignRest {
	@GetMapping("/socios/{dni}")
	public ResponseEntity<Socio> getSocio(@PathVariable String dni);
}
