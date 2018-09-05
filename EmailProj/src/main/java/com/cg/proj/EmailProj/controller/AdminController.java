package com.cg.proj.EmailProj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;
import com.cg.proj.EmailProj.service.IAdminService;




@RestController
public class AdminController {
	@Autowired
	private IAdminService service;
	
	
	@RequestMapping(value="/addMerchant",method=RequestMethod.POST)
	public String merchantAddition(@RequestBody MerchantBean merchant) throws MerchantException
	{
		System.err.println("In Back Controller..."+merchant);
		try {
			service.addMerchant(merchant);
		} catch (MerchantException e) {
			// TODO Auto-generated catch block
			throw new MerchantException(e.getMessage());
		}
		System.err.println("Out of Back COntroller...");
		return "Merchant with Id "+merchant.getEmailId()+" Added";
	}
	
	
	
	@RequestMapping(value="/deleteMerchant",method=RequestMethod.POST)
	public String merchantDelete( String emailId) throws MerchantException
	{
		try {
			service.deleteMerchant(emailId);
		} catch (MerchantException e) {
			// TODO Auto-generated catch block
			throw new MerchantException(e.getMessage());
		}
		return "Merchant with Id "+emailId+" Deleted";
	}
	
	
	/*@RequestMapping(value="/DisplayMerchant",method=RequestMethod.GET)
	public List<MerchantBean> merchantDisplay()
	{
		return service.displayMerchant();
	}
	
	
	@RequestMapping(value="/AddThirdPartyMerchant",method=RequestMethod.POST)
	public void thirdPartyMerchantAddition(@RequestBody MerchantBean merchant)
	{
		service.addThirdPartyMerchant(merchant);
	}
	
	
	
	@RequestMapping(value="/UpdateMerchant",method=RequestMethod.POST)
	public void merchantUpdation(@RequestBody MerchantBean merchant)
	{
		service.UpdateMerchant(merchant);
	}
	
	public String feedbackCommon(@RequestBody FeedbackCommon feedback)
	{
		return feedbackService.feedbackCommon(feedback);
	}*/
	
}
