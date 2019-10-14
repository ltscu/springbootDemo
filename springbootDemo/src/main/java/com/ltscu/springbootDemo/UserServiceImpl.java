package com.ltscu.springbootDemo;

import com.ltscu.springbootDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findByName(String name) {
        List<User> aa = userRepository.findByName(name);
        return aa;
    }

    @Override
     public  User save(User user) {
        User user1=new User();
        user1.setName(user.getName());
        userRepository.save(user);
        return user1;
    }


}
