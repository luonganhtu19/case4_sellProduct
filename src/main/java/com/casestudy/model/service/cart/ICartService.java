package com.casestudy.model.service.cart;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.AppUser;
import com.casestudy.model.models.Cart;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface ICartService extends IService<Cart> {
    Cart findByAppUser(AppUser appUser);

    Iterable<Cart> findAll();

    Optional<Cart> findById(Long id) throws NotFoundException;

    void delete(Long id);

    Cart save(Cart cart);

}
