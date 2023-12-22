package org.twowheels4u.mapper.impl;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.twowheels4u.dto.request.PaymentRequestDto;
import org.twowheels4u.dto.response.PaymentResponseDto;
import org.twowheels4u.mapper.PaymentMapper;
import org.twowheels4u.model.Payment;
import org.twowheels4u.model.Rental;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-21T23:56:06+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentResponseDto toDto(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentResponseDto paymentResponseDto = new PaymentResponseDto();

        if ( payment.getId() != null ) {
            paymentResponseDto.setId( payment.getId() );
        }
        if ( payment.getStatus() != null ) {
            paymentResponseDto.setStatus( payment.getStatus() );
        }
        if ( payment.getType() != null ) {
            paymentResponseDto.setType( payment.getType() );
        }
        Long id = paymentRentalId( payment );
        if ( id != null ) {
            paymentResponseDto.setRentalId( id );
        }
        if ( payment.getUrl() != null ) {
            paymentResponseDto.setSessionUrl( payment.getUrl() );
        }
        if ( payment.getSessionId() != null ) {
            paymentResponseDto.setSessionId( payment.getSessionId() );
        }
        if ( payment.getPaymentAmount() != null ) {
            paymentResponseDto.setAmount( payment.getPaymentAmount() );
        }

        return paymentResponseDto;
    }

    @Override
    public Payment toModel(PaymentRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Payment payment = new Payment();

        if ( dto != null ) {
            payment.setRental( paymentRequestDtoToRental( dto ) );
        }
        if ( dto.getType() != null ) {
            payment.setType( dto.getType() );
        }

        return payment;
    }

    private Long paymentRentalId(Payment payment) {
        if ( payment == null ) {
            return null;
        }
        Rental rental = payment.getRental();
        if ( rental == null ) {
            return null;
        }
        Long id = rental.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Rental paymentRequestDtoToRental(PaymentRequestDto paymentRequestDto) {
        if ( paymentRequestDto == null ) {
            return null;
        }

        Rental rental = new Rental();

        if ( paymentRequestDto.getRentalId() != null ) {
            rental.setId( paymentRequestDto.getRentalId() );
        }

        return rental;
    }
}
