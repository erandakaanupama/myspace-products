package com.eab.myspaceproducts.service.impl;

import com.eab.myspaceproducts.dto.CategoryDto;
import com.eab.myspaceproducts.entity.Category;
import com.eab.myspaceproducts.exception.CodeAlreadyExistsException;
import com.eab.myspaceproducts.mapper.BaseMapper;
import com.eab.myspaceproducts.repository.CategoryRepository;
import com.eab.myspaceproducts.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    private BaseMapper<Category, CategoryDto> categoryMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = categoryMapper.mapToEntity(categoryDto);

        Optional<Category> optionalCategory = categoryRepository.findByCode(category.getCode());
        if (optionalCategory.isPresent()) {
            throw new CodeAlreadyExistsException(MessageFormat.format("Category code already exists with given code: {0}", category.getCode()));
        }

        category.setCreatedBy("ADMIN");
        category.setCreatedAt(LocalDateTime.now());
        Category savedCategory = categoryRepository.save(category);
        return categoryMapper.mapFromEntity(savedCategory);
    }
}
