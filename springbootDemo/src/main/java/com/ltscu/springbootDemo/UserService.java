package com.ltscu.springbootDemo;

import com.ltscu.springbootDemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    public List<User> findByName(String name );
    public User save(User user);
    //List<User>  findByName(String name);
}
