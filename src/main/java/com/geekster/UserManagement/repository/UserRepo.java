package com.geekster.UserManagement.repository;

import com.geekster.UserManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getUsers() {
        return userList;
    }

    public User getMyUserId(Integer userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
