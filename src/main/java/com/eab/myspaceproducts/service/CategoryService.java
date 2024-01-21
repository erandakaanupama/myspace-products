package com.eab.myspaceproducts.service;

import com.eab.myspaceproducts.dto.CategoryDto;

public interface CategoryService {
    /**
     * Creates a category and returns the created category.
     *
     * @param category category to be created
     * @return A CategoryDto which contain the created category
     */
    CategoryDto createCategory(CategoryDto category);
}
