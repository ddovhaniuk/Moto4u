package org.twowheels4u.security;

import org.twowheels4u.model.User;

public interface AuthenticationService {

    User register(String email, String password, String firstName, String lastName);

    User login(String email, String password);

}
