package com.mateusnere.reserva;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Reserva extends PanacheEntity {

    public Long idCliente;
}
