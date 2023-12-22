package org.twowheels4u.mapper.impl;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import org.twowheels4u.dto.request.UserRequestDto;
import org.twowheels4u.dto.response.UserResponseDto;
import org.twowheels4u.mapper.UserMapper;
import org.twowheels4u.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-21T23:56:06+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        if ( user.getId() != null ) {
            userResponseDto.setId( user.getId() );
        }
        if ( user.getEmail() != null ) {
            userResponseDto.setEmail( user.getEmail() );
        }
        if ( user.getPassword() != null ) {
            userResponseDto.setPassword( user.getPassword() );
        }
        if ( user.getFirstName() != null ) {
            userResponseDto.setFirstName( user.getFirstName() );
        }
        if ( user.getLastName() != null ) {
            userResponseDto.setLastName( user.getLastName() );
        }
        if ( user.getRole() != null ) {
            userResponseDto.setRole( user.getRole().name() );
        }

        return userResponseDto;
    }

    @Override
    public User toModel(UserRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }
        if ( dto.getFirstName() != null ) {
            user.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            user.setLastName( dto.getLastName() );
        }

        return user;
    }
}
