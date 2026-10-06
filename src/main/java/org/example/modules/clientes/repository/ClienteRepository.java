package org.example.modules.clientes.repository;

import org.example.modules.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existByEmail(String email);
    boolean existByEmailAndIdClienteNot(String email,Long idCliente);
}
