package com.ltscu.springbootDemo;

import com.ltscu.springbootDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findByName(String name ) {
        List<User> aa=userRepository.findByName(name);
        return aa;
    }


}
