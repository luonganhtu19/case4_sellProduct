package com.casestudy.model.service.category;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Category;
import com.casestudy.model.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICategoryService extends IService<Category>  {
    Page<Category> findAll(Pageable pageable);

    Iterable<Category> findAll();

    Optional<Category> findById(Long id) throws NotFoundException;

    void delete(Long id);

    Category save(Category category);

    Page<Category> findAllByFirstNameContaining(String firstname, Pageable pageable);
    List<Category> findNewCategory();
}
