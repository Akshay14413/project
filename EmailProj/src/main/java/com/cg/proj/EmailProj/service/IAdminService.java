package com.cg.proj.EmailProj.service;

import java.util.List;

import com.cg.proj.EmailProj.bean.MerchantBean;
import com.cg.proj.EmailProj.exception.MerchantException;



public interface IAdminService {

	public MerchantBean addMerchant(MerchantBean merchant) throws MerchantException;
	
	public void deleteMerchant(String Id) throws MerchantException;
	
	/*public MerchantBean addThirdPartyMerchant(MerchantBean merchant);

	public void UpdateMerchant(MerchantBean merchant);
	
	public List<MerchantBean> displayMerchant();
	
	public double updateRevenue(String payment);*/
	
}
