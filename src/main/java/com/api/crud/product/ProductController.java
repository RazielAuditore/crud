package com.api.crud.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/Product")

public class ProductController {
    @GetMapping
public List<Product> getProduct(){
    return List.of(
            new Product(
                    25L,
                    "cuchillo",
                    500,
                    LocalDate.of(2024, Month.MARCH,5),
                    2

            ));



}
}
