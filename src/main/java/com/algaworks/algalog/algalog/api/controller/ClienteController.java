package com.algaworks.algalog.algalog.api.controller;

import com.algaworks.algalog.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Samuel");
        cliente1.setEmail("samuel@hotmail.com");
        cliente1.setTelefone("99999");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Rita");
        cliente2.setEmail("rita@hotmail.com");
        cliente2.setTelefone("88888");

        return Arrays.asList(cliente1, cliente2);
    }
}
