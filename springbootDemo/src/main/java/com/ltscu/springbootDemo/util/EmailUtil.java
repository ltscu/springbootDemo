package com.ltscu.springbootDemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

@Component
public class EmailUtil {
    private String from="m15029270703@163.com";
    @Autowired
    private JavaMailSender sender;

    /**
     * 发送一般文本邮件
     * @param to
     * @param subject
     * @param content
     */
    public void sendTextEmail(String to,String subject,String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setSentDate(new Date());
        sender.send(message);
    }

    /**
     * @param to
     * @param subject
     * @param content
     * @param imgPath
     * @param imgId
     * @throws MessagingException
     * 发送带图片并显示在邮件中的邮件
     */
    public void sendImageMail(String to, String subject, String content, String imgPath, String imgId) throws MessagingException {
        //创建message
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        //发件人
        helper.setFrom(from);
        //收件人
        helper.setTo(to);
        //标题
        helper.setSubject(subject);
        //true指的是html邮件，false指的是普通文本
        helper.setText(content, true);
        //添加图片
        FileSystemResource file = new FileSystemResource(new File(imgPath));
        helper.addInline(imgId, file);
        //发送邮件
        sender.send(message);
    }

}

