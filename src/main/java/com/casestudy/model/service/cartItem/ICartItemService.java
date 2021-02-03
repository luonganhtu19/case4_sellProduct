package com.casestudy.model.service.cartItem;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Cart;
import com.casestudy.model.models.CartItem;
import com.casestudy.model.models.Products;

import com.casestudy.model.service.IService;

import java.util.List;
import java.util.Optional;

public interface ICartItemService extends IService<CartItem>{
    Iterable<CartItem> findAllByCart(Cart cart);

    CartItem getByCartIsAndProductIs(Cart cart, Products product);

    List<CartItem> findBycarts(Cart cart);

    Iterable<CartItem> findAll();

    Optional<CartItem> findById(Long id) throws NotFoundException;

    void delete(Long id);

    CartItem save(CartItem cartItem);

}
