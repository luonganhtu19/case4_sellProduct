package com.casestudy.model.service.bill;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Bill;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface IBillService extends IService<Bill> {
    Iterable<Bill> findAll();

    Optional<Bill> findById(Long id) throws NotFoundException;

    void delete(Long id);

    Bill save(Bill bill);
}
