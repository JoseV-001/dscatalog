package com.josev001.dscatalog.services;

import com.josev001.dscatalog.dto.CategoryDTO;
import com.josev001.dscatalog.repositories.CategoryRepository;
import com.josev001.dscatalog.entities.Category;
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
        Category entity = obj.get();//obtendo o objeto do tipo Category
        return new CategoryDTO(entity);
    }

}
