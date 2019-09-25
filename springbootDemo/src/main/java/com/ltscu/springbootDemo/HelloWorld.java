/**
 * 
 */
package com.ltscu.springbootDemo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltscu.springbootDemo.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@Controller
@Api(value = "用户测试模块")
public class HelloWorld {
	
	@Autowired
	private User user;

	@ApiOperation(value = "输入用户名年龄", notes = "根据参数添加用户")
	@RequestMapping("/hello")
	@ResponseBody
	ResponseEntity<String> hello(String name , String age ) throws JsonProcessingException {
	   user.setAge(age);
	   user.setName(name);
	   ObjectMapper mapper = new ObjectMapper();
	    String json = mapper.writeValueAsString(user);  
	    System.out.println(json);
	   return new ResponseEntity<>(json, HttpStatus.OK);
		//return new ResponseEntity<>(name+"  "+"Hello World!", HttpStatus.OK);
	}
}
