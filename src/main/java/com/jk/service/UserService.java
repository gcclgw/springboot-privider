package com.jk.service;

import javax.jws.WebService;

@WebService
public interface UserService {
    void getUserInfo();


    void testUuid(String uuid);

}
