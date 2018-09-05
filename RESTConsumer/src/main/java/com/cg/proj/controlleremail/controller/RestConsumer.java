package com.cg.proj.controlleremail.controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.proj.controlleremail.bean.CouponsBean;
import com.cg.proj.controlleremail.bean.CustomerBean;
import com.cg.proj.controlleremail.bean.MerchantBean;
import com.cg.proj.controlleremail.bean.OrderBean;


@RestController
public class RestConsumer {
	
	@RequestMapping(value="/")
		public String check()
		{
			return "hello FRONT RUNNING";
		}

	
	
	@RequestMapping(value="/SendMerchantInvitationMail")
	public ModelMap sendMerchantInvitationMail(String email, ModelMap model)
	{
		//System.err.println("IN JSP FRONT CONTROLLER");
		//System.err.println("Customer email---"+email);
		 RestTemplate restTemplate=new RestTemplate();
			//CustomerBean customer=restTemplate.postForObject("http://localhost:2222/sendMail",name, CustomerBean.class);
			String merchant=restTemplate.postForObject("http://localhost:2222/sendInvitationToMerchant",email, String.class);
			//System.out.println(merchant);
			model.put("merchant", merchant);
			//System.err.println("Out Front Controller--- Customer:"+merchant);
			return model;
	}
	
	
	
	@RequestMapping(value="/addDetails",method=RequestMethod.POST)
	public Model addMerchantDetails(MerchantBean merchantBean, Model model) {
		//System.err.println("IN JSP FRONT CONTROLLER");
		//System.err.println(">>>   ---Merchant received---   >>>"+merchantBean);	
		model.addAttribute("merchantBean",merchantBean);
		RestTemplate restTemplate=new RestTemplate();
		/*MerchantBean merchant1=restTemplate.postForObject("http://localhost:2222/addMerchant",merchantBean, MerchantBean.class);
		System.err.println("Out Front Controller--- Merchant:"+merchant1);
		model.addAttribute("details", merchant1);*/
		String merchant1=restTemplate.postForObject("http://localhost:2222/addMerchant",merchantBean, String.class);
		//System.err.println("Out Front Controller--- Merchant:"+merchant1);
		model.addAttribute("details", merchant1);
		return model;
		
	}
	
	
	
	
	
	@RequestMapping(value="/deleteDetails",method=RequestMethod.POST)
	public String deleteMerchantDetails(String emailId) {
		System.err.println("IN JSP FRONT CONTROLLER");
		RestTemplate restTemplate=new RestTemplate();
		System.out.println(emailId);
		String merchant1=restTemplate.postForObject("http://localhost:2222/deleteMerchant?emailId="+emailId,emailId,String.class);
		System.err.println("Out Front Controller--- Merchant:"+merchant1);
		return merchant1;
		
	}
	

}
