package com.techdemo.pos.model.referential;

import lombok.Data;

@Data
public class ProductAttributeValue {

    private String name;
    private String value;
    private String type;
    private String order;
}
