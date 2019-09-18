/**
 * 
 */
package com.ltscu.springbootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(){
	return "hello world!";
	}
}
