package com.jxau.travel.service;

import com.jxau.travel.domain.User;

public interface UserService {
    boolean regist(User user);

    boolean active(String code);

    User login(User user);
}
