package org.twowheels4u.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.twowheels4u.model.Payment;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PaymentRequestDto {
    private Long rentalId;
    private Payment.Type type;
}

