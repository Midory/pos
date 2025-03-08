package com.techdemo.pos.service;

import com.techdemo.pos.dto.SaleDTO;
import com.techdemo.pos.mapper.SaleMapper;
import com.techdemo.pos.model.sale.Sale;
import com.techdemo.pos.repository.SaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaleService {

    private SaleRepository saleRepository;

    private SaleMapper saleMapper;

    public void store(SaleDTO saleDTO) {

        Sale sale = saleMapper.convert(saleDTO);

        saleRepository.save(sale);

    }
}
