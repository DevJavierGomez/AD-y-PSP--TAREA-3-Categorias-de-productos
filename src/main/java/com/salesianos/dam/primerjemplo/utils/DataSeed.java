package com.salesianos.dam.primerjemplo.utils;

import com.salesianos.dam.primerjemplo.dto.EditProductDto;
import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.service.CategoryService;
import com.salesianos.dam.primerjemplo.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final CategoryService categoryService;
    private final ProductService productService;

    @PostConstruct
    public void initData() {
        categoryService.addCategory(Category.builder()
                .name("Electrónica")
                .build());
        categoryService.addCategory(Category.builder()
                .name("Hogar")
                .build());
        categoryService.addCategory(Category.builder()
                .name("Deportes")
                .build());

        productService.addProduct(new EditProductDto(
                "Auriculares inalámbricos", 59.99, "Auriculares con cancelación de ruido"));
        productService.addProduct(new EditProductDto(
                "Lámpara de escritorio", 24.50, "Lámpara LED regulable"));
    }

}
