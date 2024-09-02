package com.ivandjoh.mycommerce.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    private Long id;
    private String brand;
    private String name;
    private BigDecimal price;
    private int quantity;
    private String description;

    private Category category;

    private List<Image> images;
}
