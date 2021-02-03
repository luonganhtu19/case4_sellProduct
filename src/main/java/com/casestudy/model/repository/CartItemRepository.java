package com.casestudy.model.repository;

import com.casestudy.model.models.Cart;
import com.casestudy.model.models.CartItem;
import com.casestudy.model.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Iterable<CartItem> findAllByCart(Cart cart);
    CartItem getByCartIsAndProductsIs(Cart cart, Products product);
}
