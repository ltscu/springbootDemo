package com.ltscu.springbootDemo;

import com.ltscu.springbootDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User,String> {

     public  List<User>  findByName(String name);
     //List<User> findAll();CrudRepository
}
