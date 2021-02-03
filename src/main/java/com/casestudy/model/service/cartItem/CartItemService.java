package com.casestudy.model.service.cartItem;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Cart;
import com.casestudy.model.models.CartItem;
import com.casestudy.model.models.Products;
import com.casestudy.model.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartItemService implements ICartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;


    @Override
    public Iterable<CartItem> findAll() {
        return null;
    }

    @Override
    public Optional<CartItem> findById(Long id) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public Iterable<CartItem> findAllByCart(Cart cart) {
        return cartItemRepository.findAllByCart(cart);
    }

    @Override
    public CartItem getByCartIsAndProductIs(Cart cart, Products product) {
        return cartItemRepository.getByCartIsAndProductsIs(cart,product);
    }

    @Override
    public List<CartItem> findBycarts(Cart cart) {
        Iterable<CartItem> cartItems = cartItemRepository.findAllByCart(cart);
        List<CartItem> cartItemList = new ArrayList<>();
        for (CartItem cartItem : cartItems){
            cartItemList.add(cartItem);
        }
        return cartItemList;
    }
}
