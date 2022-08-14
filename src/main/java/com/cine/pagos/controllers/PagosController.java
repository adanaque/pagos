package com.cine.pagos.controllers;

import com.cine.pagos.clients.SociosFeignRest;
import com.cine.pagos.models.Pago;
import com.cine.pagos.models.Socio;
import com.cine.pagos.models.dao.PagosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@RestController("pagos")
public class PagosController {
    @Autowired
    PagosDao pagosRepository;

    @Autowired
    SociosFeignRest sociosFeignRest;

    @GetMapping("/")
    public List<Pago> getPagos()
    {
        Iterable<Pago> result = pagosRepository.findAll();
        List<Pago> pagosList = new ArrayList<Pago>();
        result.forEach(pagosList::add);
        return pagosList;
    }

    @PostMapping("/pago")
    public Response savePago(@RequestBody Pago pago)
    {
        ResponseEntity<Socio> responseEntity=sociosFeignRest.getSocio(pago.getDni());
       if(responseEntity.getBody()==null){
           return Response.noContent().entity("Socio no existe").build();
       }
       if(responseEntity.getBody().getEstado().equals("1")){
           return Response.ok().entity(pagosRepository.save(pago)).build();
       }else{
           return Response.noContent().entity("Socio Inactivo").build();
       }



    }
}
