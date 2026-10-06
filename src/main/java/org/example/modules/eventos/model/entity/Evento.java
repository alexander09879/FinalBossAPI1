package org.example.modules.eventos.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "EVENTOS" )
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long idEvento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long idCliente;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long idSalon;

    @Column(name = "Nombre_Evento", nullable = false, length = 100)
    private String nombre_evento;

    @Column(name = "Fecha_Evento")
    private Date fecha_evento;

    @Column(name = )
}
