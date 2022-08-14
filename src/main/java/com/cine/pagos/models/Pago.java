package com.cine.pagos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Table
public class Pago {
    @Id
    private @NonNull UUID id;
    private @NonNull String dni;
    private @NonNull LocalDate fecha;
    private @NonNull Double montoPago;
}
