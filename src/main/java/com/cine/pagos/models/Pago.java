package com.cine.pagos.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@Builder
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
