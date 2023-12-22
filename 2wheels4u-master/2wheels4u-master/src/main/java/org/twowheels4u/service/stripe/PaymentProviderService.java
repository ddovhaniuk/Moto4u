package org.twowheels4u.service.stripe;

import com.stripe.model.checkout.Session;
import java.math.BigDecimal;
import org.twowheels4u.model.Payment;

public interface PaymentProviderService {
    Session createPaymentSession(BigDecimal payment, BigDecimal fine, Payment paymentObject);
}
