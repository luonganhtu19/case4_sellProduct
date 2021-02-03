package com.casestudy.model.repository;

import com.casestudy.model.models.AppUser;
import com.casestudy.model.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
    Cart findByAppUser(AppUser appUser);
}
