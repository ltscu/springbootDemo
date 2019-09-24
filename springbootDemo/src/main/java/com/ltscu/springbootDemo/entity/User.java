/**
 * 
 */
package com.ltscu.springbootDemo.entity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
public class User {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
private String age;

@Override
public String toString() {
    String a="User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    
	return a;
}
}
