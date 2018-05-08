package com.akfx.qh.service;

import com.akfx.qh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private UserDao userDao;

    @Autowired
    public RegistrationServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void registerNewUser(String login, String password) {
        this.userDao.addUser(login, password);
    }
}
