package com.ltscu.springbootDemo.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Autowired
    EmailUtil text;
    @Test
    public void contextLoads() {
        //992711179@qq.com
        text.sendTextEmail("your mail address","test","helloworld");
    }

    /**
     * @throws MessagingException
     * 发送带图片的邮件
     */
    @Test
    public void sendImageEmailTest() throws MessagingException {
        text.sendImageMail("yourEmailAddr","image测试","<h1 style='color:red'>helloWorld</h1><img src='cid:0011'/>","G:\\壁纸\\timg.jpg","001");
    }
}
