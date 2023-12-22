package org.twowheels4u.service;

import java.util.List;
import org.twowheels4u.model.Payment;

public interface PaymentService {

    Payment save(Payment payment);

    void delete(Payment payment);

    Payment getById(Long id);

    List<Payment> getByUserId(Long userId);

    List<Payment> findAll();

}
