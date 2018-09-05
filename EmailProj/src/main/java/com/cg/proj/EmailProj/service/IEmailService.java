package com.cg.proj.EmailProj.service;

import com.cg.proj.EmailProj.bean.CustomerBean;
import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;

public interface IEmailService {
	public String RegiteredNewUser(String name);
	public MerchantBean sendInvitationToMerchant(String email) throws MerchantException;
//	public CustomerBean sentInvitationToCustomer(String email);

}
