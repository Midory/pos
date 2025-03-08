package com.techdemo.pos.controller;

import com.techdemo.pos.dto.SaleDTO;
import com.techdemo.pos.service.SaleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping("/")
    public void store(@Valid SaleDTO saleDTO) {

        saleService.store(saleDTO);

    }
}
