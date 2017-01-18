package com.products.controller;

import com.products.model.Product;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String findAll() {
       return "all";
    }

    @GetMapping("/{productId}")
    public Product findOne() {
        return new Product(1, "Product1","product Description", true, 1);
    }

    @PutMapping("/{productId}")
    public String delete(@PathParam(value = "productId") int productId) {
        return "deleted";
    }

    @PatchMapping("/{productId}")
    public String update(@PathParam(value = "productId") int productId, @RequestBody Product product) {
        return "updated.";
    }

}
