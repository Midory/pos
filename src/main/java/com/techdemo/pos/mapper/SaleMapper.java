package com.techdemo.pos.mapper;

import com.techdemo.pos.dto.SaleDTO;
import com.techdemo.pos.model.sale.Sale;
import org.mapstruct.Mapper;

@Mapper(imports = SaleItemMapper.class)
public interface SaleMapper {

    Sale convert(SaleDTO saleDTO);
}
