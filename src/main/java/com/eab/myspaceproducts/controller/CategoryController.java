package com.eab.myspaceproducts.controller;

import com.eab.myspaceproducts.dto.CategoryDto;
import com.eab.myspaceproducts.dto.ResponseDto;
import com.eab.myspaceproducts.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = (MediaType.APPLICATION_JSON_VALUE))
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @PostMapping("/categories")
    public ResponseEntity<ResponseDto<CategoryDto>> createCategory(@RequestBody CategoryDto categoryDto) {
        CategoryDto savedCategory = categoryService.createCategory(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto<>(savedCategory, HttpStatus.CREATED.getReasonPhrase(), "Category created successfully"));
    }
}
