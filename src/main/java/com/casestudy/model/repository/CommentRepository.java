package com.casestudy.model.repository;

import com.casestudy.model.models.Comment;
import com.casestudy.model.models.Products;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {
    Iterable<Comment> findAllByProductOrderByIdDesc(Products products);
    Integer countAllByProduct(Products products);
}
