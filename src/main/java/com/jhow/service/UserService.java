package com.jhow.service;

import com.jhow.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
