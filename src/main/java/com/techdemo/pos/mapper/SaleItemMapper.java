package com.techdemo.pos.mapper;

import com.techdemo.pos.dto.SaleItemDTO;
import com.techdemo.pos.model.sale.SaleItem;
import org.mapstruct.Mapper;

@Mapper
public interface SaleItemMapper {

    SaleItem convert(SaleItemDTO saleItemDTO);
}
