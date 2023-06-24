package com.geekster.UserManagement.configuration;

import com.geekster.UserManagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanManager {
    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(0,"Hrishi","Hrishirich","India","9284410799");
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
