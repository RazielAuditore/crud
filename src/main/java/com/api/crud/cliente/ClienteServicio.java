package com.api.crud.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    HashMap<String,Object>datos;

    private final ClienteRepository clienteRepository;
    @Autowired
    public ClienteServicio(ClienteRepository clienteRepository){this.clienteRepository=clienteRepository;}

    public List<Cliente> getCliente(){




        return this.clienteRepository. findAll();



    }

    public ResponseEntity<Object> newCliente(Cliente cliente) {
        Optional<Cliente> res = clienteRepository.findClienteBynombreCliente(cliente.getNombreCliente());
        datos=new HashMap<>();



        if(res.isPresent() && cliente.getIdc()==null){
            datos.put("ERROR",true);
            datos.put("MESSAGE","ESTE PRODUCTO YA EXISTE COQUETON");


            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("MESSAGE","ACTUALIZADO SAPHEEEEEE");
        if (cliente.getIdc()!=null){
            datos.put("MESSAGE","ACTUALIZADO SAPHEEEEEE ");
        }
        clienteRepository.save(cliente);
        datos.put("data",cliente);
        datos.put("MESSAGE","SE GUARDO PAPITO");
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );


    }
    public ResponseEntity<Object>Deletecliente(Long id){
        datos=new HashMap<>();

        boolean existe=  this.clienteRepository.existsById(id);
        if(!existe){
            datos.put("ERROR",true);
            datos.put("MESSAGE","ESTE PRODUCTO NO EXISTTE BEBE ");


            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );

        }
        clienteRepository.deleteById(id);

        datos.put("data ","producto eliminado");



        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );


    }
}