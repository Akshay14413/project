package com.cg.proj.EmailProj.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.EmailProj.bean.CustomerBean;
import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;
import com.cg.proj.EmailProj.service.IEmailService;
@RestController
public class MailController {
	@Autowired
	private IEmailService EmailServiceImpl;
	@Autowired
	private JavaMailSender javaMailSender;
	/*@Autowired
	public MailController(JavaMailSender javaMailSender)
	{
		this.javaMailSender=javaMailSender;
		
	}*/
	
	@RequestMapping(value="/")
	public String check()
	{
		return "hello BACK RUNNING";
	}
	
	
	private void sendInvitationToMerchant(String emailId) throws MessagingException
	{
		MimeMessage message=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		helper.setTo(EmailServiceImpl.RegiteredNewUser(emailId));
		helper.setText("you are invited to sell this product");
		helper.setSubject("Invitation ");
		javaMailSender.send(message);
	}
	

	@RequestMapping(value="/sendInvitationToMerchant", method=RequestMethod.POST)
	public String inviteMerchant(@RequestBody String Email) throws MessagingException {
		//System.err.println("IN BACK CONTROLLER...");
		//System.err.println("email of customer:"+Email);
		MerchantBean merchantBean;
		//sendInvitationToMerchant(Email);
		try {
			merchantBean = EmailServiceImpl.sendInvitationToMerchant(Email);
		} catch (MerchantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Invitation has been sent successfully to "+Email;
	
	}

}                                        
