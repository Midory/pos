package com.techdemo.pos.service;

import com.techdemo.pos.model.referential.Product;
import com.techdemo.pos.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {


    private ProductRepository repository;

    /**
     * Fetch Product by Bar code
     *
     * @param barcode barcode
     * @return Optional of Product
     */
    public Optional<Product> findByBarcode(String barcode) {

        return repository.findByBarcode(barcode);

    }

    /**
     * Find all Products
     *
     * @return List of Product
     */
    public List<Product> findAll() {
        return repository.findAll();
    }




}