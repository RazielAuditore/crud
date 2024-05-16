package com.api.crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/Product")

public class ProductController {
    private final ProductService productService;


    @Autowired

    public ProductController(ProductService productService){
        this.productService=productService;


    }
    @GetMapping
    public List<Product>getProducts(){
        return productService.getProduct();
    }
    @PostMapping
    public void registrarProducto(@RequestBody Product product){
        this.productService.newProduct(product);
    }

}
