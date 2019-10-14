/**
 *
 */
package com.ltscu.springbootDemo.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */

@Entity
@Table(name = "user")
public class User extends AbstractEntity  {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//主键
    @Column
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

    @Column
    private String age;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Column
    private String address;
    @Column
    private String salary;

   /* @Override
    public String toString() {
        String a = "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

        return a;
    }*/
}
