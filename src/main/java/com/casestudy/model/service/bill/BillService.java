package com.casestudy.model.service.bill;

import com.casestudy.model.exeption.NotFoundException;
import com.casestudy.model.models.Bill;
import com.casestudy.model.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillService implements IBillService {
    @Autowired
    private BillRepository billRepository;
    @Override
    public Iterable<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public Optional<Bill> findById(Long id) throws NotFoundException {
        return billRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        billRepository.deleteById(id);
    }

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }
}
