package org.example.modules.clientes.service;

import org.example.modules.clientes.model.dto.ClienteResponseDTO;
import org.example.modules.clientes.model.entity.Cliente;
import org.example.modules.clientes.repository.ClienteRepository;
import org.example.modules.eventos.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EventosRepository eventosRepository;

    public ClienteResponseDTO obtenerTodos(){

    }



