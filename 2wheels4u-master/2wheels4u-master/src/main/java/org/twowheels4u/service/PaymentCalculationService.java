package org.twowheels4u.service;

import java.math.BigDecimal;
import org.twowheels4u.model.Payment;

public interface PaymentCalculationService {
    BigDecimal calculatePaymentAmount(Payment payment);

    BigDecimal calculateFineAmount(Payment payment);
}
