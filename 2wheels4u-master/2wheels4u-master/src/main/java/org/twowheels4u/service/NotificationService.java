package org.twowheels4u.service;

import org.twowheels4u.model.Payment;
import org.twowheels4u.model.Rental;

public interface NotificationService {

    void sendSuccessfulRentMessage(Rental rental);

    void sendMessageToAdmin(String message);

    void sendPaymentMessageToUser(Payment payment, String message);

    void checkOverdueRentals();
}
