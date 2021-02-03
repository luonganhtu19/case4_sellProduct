package com.casestudy.model.service;

import com.casestudy.model.exeption.NotFoundException;

import java.util.Optional;


public interface IService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id) throws NotFoundException, NotFoundException;
    void delete(Long id);
    T save(T t);
}
