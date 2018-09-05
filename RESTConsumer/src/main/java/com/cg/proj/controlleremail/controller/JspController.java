package com.cg.proj.controlleremail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {
	

	@RequestMapping(value="/submit")
	public String wel() {
		return "submit";
	}
	
	
	@RequestMapping(value="/MerchantInvitation")
	public String sendInvitationToMerchant()
	
	{
		return "MerchantInvitation";
	}
	
	
	@RequestMapping(value="/AddMerchant")
	public String addMerchantDetails() {
		System.err.println("In JSP CONTROL TRANSFER  >>>");
		return "AddMerchant";
	}
	
	
	@RequestMapping(value="/DeleteMerchant")
	public String deleteMerchantDetails() {
		System.err.println("In JSP CONTROL TRANSFER  >>>");
	System.err.println(1);
		return "DeleteMerchant";
	}
	
	
	
	
}
