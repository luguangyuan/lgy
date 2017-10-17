package com.by.email;

import java.security.GeneralSecurityException;
import java.util.Properties;
import java.util.concurrent.ThreadPoolExecutor;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailTool {
	  public static void main(String[] args) throws MessagingException, GeneralSecurityException {
	   /* Properties props = new Properties();
	 
	    // 开启debug调试
	    props.setProperty("mail.debug", "true");
	    // 发送服务器需要身份验证
	    props.setProperty("mail.smtp.auth", "true");
	    // 设置邮件服务器主机名
	    props.setProperty("mail.host", "ser.thtfpc.com");
	    // 发送邮件协议名称
	    props.setProperty("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.port", "25");
	    MailSSLSocketFactory sf = new MailSSLSocketFactory();
	    sf.setTrustAllHosts(true);
	    
	    props.put("mail.smtp.ssl.enable", "true");
	    props.put("mail.smtp.ssl.socketFactory", sf);
	 
	    Session session = Session.getInstance(props);
	 
	    Message msg = new MimeMessage(session);
	    msg.setSubject("测试邮件");
	    StringBuilder builder = new StringBuilder();
	    //邮件内容
	    builder.append("qq空间地址： " + "https://user.qzone.qq.com/1028203709/infocenter");
	    builder.append("\n发送给管哥的邮件【标题】");
	    builder.append("\n时间 ：" + System.currentTimeMillis());
	    builder.append("\n内容 ：" + "你好，路漫漫其修远兮！<img src='http://test.e-oos.com/admin/static/img/b.png'>");
	    msg.setContent(builder.toString(),"text/html;charset=UTF-8");
	    //msg.setText(builder.toString());
	    msg.setFrom(new InternetAddress("luguangyuan@ser.thtfpc.com"));
	 
	    Transport transport = session.getTransport();
	    transport.connect("ser.thtfpc.com", "luguangyuan@ser.thtfpc.com", "123"); //授权码
	 
	    transport.sendMessage(msg, new Address[] { new InternetAddress("984458235@qq.com") });
	    transport.close();*/
		  System.out.println();
		  System.out.println("luguangyuan");
	  }
}
