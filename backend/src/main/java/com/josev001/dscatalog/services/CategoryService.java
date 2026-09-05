package com.josev001.dscatalog.services;

import com.josev001.dscatalog.dto.CategoryDTO;
import com.josev001.dscatalog.repositories.CategoryRepository;
import com.josev001.dscatalog.entities.Category;
import com.josev001.dscatalog.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository Repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
       List<Category> list = Repository.findAll();
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id){
        Optional<Category> obj = Repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Category not found")); //obtendo o objeto ou lançando uma exceção caso não seja encontrado
        return new CategoryDTO(entity);
    }

    @Transactional
    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity = Repository.save(entity);
        return new CategoryDTO(entity);
    }

}
