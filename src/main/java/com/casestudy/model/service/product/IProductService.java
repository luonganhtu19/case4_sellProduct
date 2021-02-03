package com.casestudy.model.service.product;

import com.casestudy.model.models.Cart;
import com.casestudy.model.models.Category;
import com.casestudy.model.models.Products;
import com.casestudy.model.models.TradeMark;
import com.casestudy.model.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService extends IService<Products> {
    Page<Products> findAllByNameContaining(String name, Pageable pageable);
    Page<Products> findAll(Pageable pageable);
    Page<Products> findAllByTradeMark(TradeMark tradeMark, Pageable pageable);
    Page<Products> findAllByCategory(Category category, Pageable pageable);
    Page<Products> findAllByNameContainingAndCategory(String name,Category category, Pageable pageable);
    Page<Products> findAllByNameContainingAndTradeMark(String name,TradeMark tradeMark, Pageable pageable);
    Page<Products> findAllByCategoryAndTradeMark(Category category, TradeMark tradeMark, Pageable pageable);
    Page<Products> findAllByNameContainingAndTradeMarkAndCategory(String name,Category category, TradeMark tradeMark, Pageable pageable);
    Iterable<Products> findAllBy8Day();
    Iterable<Products>findAllByTradeMark(TradeMark tradeMark);
    Iterable<Products> findAllByPriceBetween(Double min, Double max);
    List<Products> findAllByCart(Cart cart);
}
