package com.casestudy.model.repository;

import com.casestudy.model.models.Category;
import com.casestudy.model.models.Products;
import com.casestudy.model.models.TradeMark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Products,Long> {

    Page<Products> findAllByNameContaining(String name, Pageable pageable);

    Page<Products> findAllByTradeMark(TradeMark tradeMark, Pageable pageable);

    Page<Products> findAllByCategory(Category category, Pageable pageable);

    Page<Products> findAllByNameContainingAndCategory(String name, Category category, Pageable pageable);

    Page<Products> findAllByNameContainingAndTradeMark(String name, TradeMark tradeMark, Pageable pageable);

    Page<Products> findAllByCategoryAndTradeMark(Category category, TradeMark tradeMark, Pageable pageable);

    Page<Products> findAllByNameContainingAndTradeMarkAndCategory(String name, Category category, TradeMark tradeMark, Pageable pageable);

    @Query(value = "select *from products where timestamp < DATE_ADD(curdate(), INTERVAL 8 DAY);", nativeQuery = true)
    Iterable<Products> findAllBy8Day();

    Iterable<Products> findAllByTradeMark(TradeMark tradeMark);

    Iterable<Products> findAllByPriceBetween(Double min, Double max);

}

