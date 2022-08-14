package com.cine.pagos.models.dao;


import com.cine.pagos.models.Pago;
import org.springframework.data.repository.CrudRepository;

public interface PagosDao extends CrudRepository<Pago, String> {
}
