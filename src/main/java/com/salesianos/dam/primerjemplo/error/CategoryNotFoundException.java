package com.salesianos.dam.primerjemplo.error;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException() {
        super("Category not found");
    }

    public CategoryNotFoundException(Long id) {
        super("Category not found with id " + id);
    }
}
