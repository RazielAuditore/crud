package com.api.crud.cliente;

import com.api.crud.product.Product;
import com.api.crud.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api2/v1/cliente")
public class ClienteController {

    private final ClienteServicio clienteServicio;


    @Autowired

    public ClienteController(ClienteServicio clienteServicio){
        this.clienteServicio=clienteServicio;


    }
    @GetMapping

    public List<Cliente> getCliente(){return clienteServicio.getCliente();
    }
    @PostMapping
    public ResponseEntity<Object> registrarCliente(@RequestBody Cliente cliente){
        return this.clienteServicio.newCliente(cliente);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarCliente(@RequestBody Cliente cliente){
        return this.clienteServicio.newCliente(cliente);
    }
    @DeleteMapping(path="{clienteIdc}")
    public ResponseEntity<Object>eliminar(@PathVariable("clienteIdc") Long idc ) {
        return this.clienteServicio.Deletecliente(idc);
    }

    }
