package com.spring.springbootexpensetracker.services;

import com.spring.springbootexpensetracker.domain.User;
import com.spring.springbootexpensetracker.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
