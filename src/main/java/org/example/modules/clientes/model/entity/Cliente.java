package org.example.modules.clientes.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long idCliente;

    @Column(name = "Nombre",nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido",nullable = false, length = 100)
    private String apellido;

    @Column(name = "Telefono",nullable = false, length = 15)
    private String telefono;

    @Column(name = "Email",nullable = false, length = 100)
    private String email;

    @Column(name = "Direccion",nullable = false, length = 200)
    private String direccion;

}
