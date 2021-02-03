package com.casestudy.model.service.billdetails;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.BillDetails;
import com.casestudy.model.repository.BillDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillDetailsService implements IBillDetailsService {
   @Autowired
   private BillDetailsRepository billDetailsRepository;
    @Override
    public Iterable<BillDetails> findAll() {
        return billDetailsRepository.findAll();
    }

    @Override
    public Optional<BillDetails> findById(Long id) throws NotFoundException {
        return billDetailsRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        billDetailsRepository.deleteById(id);
    }

    @Override
    public BillDetails save(BillDetails billDetails) {
        return billDetailsRepository.save(billDetails);
    }

    @Override
    public Iterable<BillDetails> findAllByBillDetails(Long id) {
        return billDetailsRepository.findAllByBill_Id(id);
    }
}
