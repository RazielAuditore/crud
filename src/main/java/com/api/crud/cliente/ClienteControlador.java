package com.api.crud.cliente;

import com.api.crud.FerreteriaApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api2/v1/clientes")

public class ClienteControlador {
    private final ClienteServicio clienteServicio;


    @Autowired
    public ClienteControlador(ClienteServicio clienteServicio) {

        this.clienteServicio = clienteServicio;
    }

    @GetMapping
    public List<Cliente> getCliente() {
        return this.clienteServicio.getCliente();
    }

    @PostMapping
    public ResponseEntity<Object> registrarcliente(@RequestBody Cliente cliente) {
        return this.clienteServicio.newCliente(cliente);


    }

    @PutMapping
    public ResponseEntity<Object> Actualizarcliente(@RequestBody Cliente cliente) {
        return this.clienteServicio.newCliente(cliente);

    }

    }




















