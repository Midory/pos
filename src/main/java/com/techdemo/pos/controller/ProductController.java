package com.techdemo.pos.controller;

import com.techdemo.pos.model.referential.Product;
import com.techdemo.pos.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {


    private ProductService productService;


    @GetMapping("/barcode/{barcode}")
    public ResponseEntity<Product> findByBarCode(@PathVariable String barcode){

        Optional<Product> productOptional = productService.findByBarcode(barcode);

        return productOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Find All
     *
     * @return All Products
     */
    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll(){

        return ResponseEntity.ok(productService.findAll());
    }


}
