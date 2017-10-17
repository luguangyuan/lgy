package com.guanguan.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guanguan.service.MailService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

@Controller
public class TesController {

	@Autowired
	private MailService mailService;
	
	@SuppressWarnings("static-access")
	@RequestMapping("/test")
	public String getoTest(){
		try {
			mailService.sendHtmlMail("247701935@qq.com", "测试", "你好啊，我是你的额工程师");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "main";
	}
	
}
