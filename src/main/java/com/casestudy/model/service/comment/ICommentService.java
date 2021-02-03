package com.casestudy.model.service.comment;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Comment;
import com.casestudy.model.models.Products;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface ICommentService extends IService<Comment> {
    Iterable<Comment> findAllByProduct(Products products);
    Integer countAllByProduct(Products products);

    Iterable<Comment> findAll();

    Optional<Comment> findById(Long id) throws NotFoundException;

    void delete(Long id);

    Comment save(Comment comment);

}
