package com.cg.proj.EmailProj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.proj.EmailProj.bean.CustomerBean;
import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;
import com.cg.proj.EmailProj.repo.EmailRepo;
@Service
public class EmailServiceImpl implements IEmailService {
@Autowired
	private EmailRepo emailRepo;

	@Override
	public String RegiteredNewUser(String name) {
		// TODO Auto-generated method stub
		return emailRepo.findCustomerEmail(name);
	}

	/*@Override
	public String sendInvitationToMerchant(String email) {
		// TODO Auto-generated method stub
		return emailRepo.findMechant(email);
	}*/

	/*@Override
	public CustomerBean sentInvitationToCustomer(String email) {
		// TODO Auto-generated method stub
		return emailRepo.findCustomer(email);
	}
*/
	@Override
	public MerchantBean sendInvitationToMerchant(String email) throws MerchantException {
		// TODO Auto-generated method stub
		return emailRepo.findMechant(email);
	}

	

	
	
	

}
