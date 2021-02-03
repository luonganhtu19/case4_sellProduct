package com.casestudy.model.service.billdetails;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.BillDetails;
import com.casestudy.model.service.IService;

import java.util.Optional;

public interface IBillDetailsService extends IService<BillDetails> {
    Iterable<BillDetails> findAll();

    Optional<BillDetails> findById(Long id) throws NotFoundException;

    void delete(Long id);

    BillDetails save(BillDetails billDetails);

    Iterable<BillDetails> findAllByBillDetails(Long id);
}
