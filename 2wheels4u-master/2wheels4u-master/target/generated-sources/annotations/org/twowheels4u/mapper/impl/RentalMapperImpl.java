package org.twowheels4u.mapper.impl;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.twowheels4u.dto.request.RentalRequestDto;
import org.twowheels4u.dto.response.RentalResponseDto;
import org.twowheels4u.mapper.RentalMapper;
import org.twowheels4u.model.Motorcycle;
import org.twowheels4u.model.Rental;
import org.twowheels4u.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-21T23:56:06+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class RentalMapperImpl implements RentalMapper {

    @Override
    public RentalResponseDto toDto(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        RentalResponseDto rentalResponseDto = new RentalResponseDto();

        if ( rental.getId() != null ) {
            rentalResponseDto.setId( rental.getId() );
        }
        if ( rental.getReturnDate() != null ) {
            rentalResponseDto.setReturnDate( rental.getReturnDate() );
        }
        if ( rental.getRentalDate() != null ) {
            rentalResponseDto.setRentalDate( rental.getRentalDate() );
        }
        if ( rental.getActualReturnDate() != null ) {
            rentalResponseDto.setActualReturnDate( rental.getActualReturnDate() );
        }
        Long id = rentalUserId( rental );
        if ( id != null ) {
            rentalResponseDto.setUserId( id );
        }
        Long id1 = rentalMotorcycleId( rental );
        if ( id1 != null ) {
            rentalResponseDto.setMotorcycleId( id1 );
        }

        return rentalResponseDto;
    }

    @Override
    public Rental toModel(RentalRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Rental rental = new Rental();

        if ( dto != null ) {
            rental.setMotorcycle( rentalRequestDtoToMotorcycle( dto ) );
        }
        if ( dto.getRentalDate() != null ) {
            rental.setRentalDate( dto.getRentalDate() );
        }
        if ( dto.getReturnDate() != null ) {
            rental.setReturnDate( dto.getReturnDate() );
        }

        return rental;
    }

    private Long rentalUserId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        User user = rental.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long rentalMotorcycleId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Motorcycle motorcycle = rental.getMotorcycle();
        if ( motorcycle == null ) {
            return null;
        }
        Long id = motorcycle.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Motorcycle rentalRequestDtoToMotorcycle(RentalRequestDto rentalRequestDto) {
        if ( rentalRequestDto == null ) {
            return null;
        }

        Motorcycle motorcycle = new Motorcycle();

        if ( rentalRequestDto.getMotorcycleId() != null ) {
            motorcycle.setId( rentalRequestDto.getMotorcycleId() );
        }

        return motorcycle;
    }
}
