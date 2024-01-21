package com.eab.myspaceproducts.mapper;

import com.eab.myspaceproducts.dto.CategoryDto;
import com.eab.myspaceproducts.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper implements BaseMapper<Category, CategoryDto> {
    @Override
    public Category mapToEntity(CategoryDto dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setCode(dto.getCode());

        return category;
    }

    @Override
    public CategoryDto mapFromEntity(Category entity) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(entity.getName());
        categoryDto.setCode(entity.getCode());
        categoryDto.setId(entity.getId());
        return categoryDto;
    }
}
