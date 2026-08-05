package com.josev001.dscatalog.Services;

import com.josev001.dscatalog.Repositories.CategoryRepository;
import com.josev001.dscatalog.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }



}
