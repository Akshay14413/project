package com.cg.proj.EmailProj.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;
import com.cg.proj.EmailProj.repo.ICapStoreRepo;



@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private ICapStoreRepo repo;
	@Override
	public MerchantBean addMerchant(MerchantBean merchant) throws MerchantException {
		System.err.println("IN ADD MERCHANTS...");
		boolean a=validateMerchant(merchant);
		if(a)
		return repo.save(merchant);
		else
			return merchant;
		
	
	}

	@Override
	public void deleteMerchant(String Id) throws MerchantException {
		if(Id.isEmpty())
			throw new MerchantException("id cannot be empty");
		repo.deleteById(Id);
		
	}
	
	
	private boolean validateMerchant(MerchantBean merchant) throws MerchantException {
		System.err.println("VALIDATING...");
		if(merchant.getEmailId().isEmpty())
			throw new MerchantException("id cannot be empty");
		if(merchant.getMerchantName().isEmpty())
			throw new MerchantException("Name cannot be empty");
		if(!merchant.getMerchantName().matches("[A-Za-z]{2,20}"))
			throw new MerchantException("Merchant Name must have only alphabets");
		System.err.println("DONE VALIDATING...");
		return true;
	}
	

	
	
	
	

}
