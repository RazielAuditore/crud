package com.api.crud.cliente;

import com.api.crud.product.Product;
import com.api.crud.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ClienteServicio {
    HashMap<String, Object> datos;
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServicio(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;

    }

    public List<Cliente> getCliente() {
        return this.clienteRepository.findAll();
    }

    public ResponseEntity<Object> newCliente(Cliente cliente) {
        Optional<Cliente> res = clienteRepository.findClienteByNombre(cliente.getNombre());
        datos = new HashMap<>();


        if (res.isPresent() && cliente.getIdc() == null) {
            datos.put("error", true);
            datos.put("mensaje", "ya existe esto papi");
            return new ResponseEntity<Object>(
                    datos,
                    HttpStatus.CONFLICT

            );


        }
        datos.put("mensaje", "se guardo papi ");
        if (cliente.getIdc() != null) {
            datos.put("mensaje", "se actualizo papi ");
        }
        clienteRepository.save(cliente);
        datos.put("data", cliente);
        datos.put("mensaje", "se guardo papi ");
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );


    }





    }






























