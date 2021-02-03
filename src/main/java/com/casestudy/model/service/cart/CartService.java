package com.casestudy.model.service.cart;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.AppUser;
import com.casestudy.model.models.Cart;
import com.casestudy.model.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService implements ICartService{
    @Autowired
    private CartRepository cartRepository;
    @Override
    public Iterable<Cart> findAll() {
        return null;
    }

    @Override
    public Optional<Cart> findById(Long id) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart findByAppUser(AppUser appUser) {
        return cartRepository.findByAppUser(appUser);
    }
}
