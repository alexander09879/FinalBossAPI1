package org.example.modules.clientes.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ClienteRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El Apellido es obligatorio")
    private String apellido;

    @NotBlank(message = "El Telefono es obligatorio")
    private String telefono;

    @NotBlank(message = "El Email es obligatorio")
    @Email(message = "Debe ser un correo con formto valido")
    private String email;

    private String direcion;


}
