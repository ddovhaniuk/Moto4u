package org.twowheels4u.mapper.impl;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.twowheels4u.dto.request.MotorcycleRequestDto;
import org.twowheels4u.dto.response.MotorcycleResponseDto;
import org.twowheels4u.mapper.MotorcycleMapper;
import org.twowheels4u.model.Motorcycle;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-21T23:56:06+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class MotorcycleMapperImpl implements MotorcycleMapper {

    @Override
    public MotorcycleResponseDto toDto(Motorcycle motorcycle) {
        if ( motorcycle == null ) {
            return null;
        }

        MotorcycleResponseDto motorcycleResponseDto = new MotorcycleResponseDto();

        if ( motorcycle.getId() != null ) {
            motorcycleResponseDto.setId( motorcycle.getId() );
        }
        if ( motorcycle.getModel() != null ) {
            motorcycleResponseDto.setModel( motorcycle.getModel() );
        }
        if ( motorcycle.getManufacturer() != null ) {
            motorcycleResponseDto.setManufacturer( motorcycle.getManufacturer() );
        }
        if ( motorcycle.getInventory() != null ) {
            motorcycleResponseDto.setInventory( motorcycle.getInventory() );
        }
        if ( motorcycle.getType() != null ) {
            motorcycleResponseDto.setType( motorcycle.getType().name() );
        }
        if ( motorcycle.getFee() != null ) {
            motorcycleResponseDto.setFee( motorcycle.getFee() );
        }
        motorcycleResponseDto.setDeleted( motorcycle.isDeleted() );

        return motorcycleResponseDto;
    }

    @Override
    public Motorcycle toModel(MotorcycleRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Motorcycle motorcycle = new Motorcycle();

        if ( dto.getModel() != null ) {
            motorcycle.setModel( dto.getModel() );
        }
        if ( dto.getManufacturer() != null ) {
            motorcycle.setManufacturer( dto.getManufacturer() );
        }
        if ( dto.getInventory() != null ) {
            motorcycle.setInventory( dto.getInventory() );
        }
        if ( dto.getType() != null ) {
            motorcycle.setType( Enum.valueOf( Motorcycle.Type.class, dto.getType() ) );
        }
        if ( dto.getFee() != null ) {
            motorcycle.setFee( dto.getFee() );
        }

        return motorcycle;
    }
}
