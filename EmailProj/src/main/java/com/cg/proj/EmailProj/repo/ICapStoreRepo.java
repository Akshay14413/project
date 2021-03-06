package com.cg.proj.EmailProj.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.proj.EmailProj.bean.MerchantBean;





@Repository
public interface ICapStoreRepo extends JpaRepository<MerchantBean,String> {

	
	@Query("select e.minBillingAmount from OrderBean e where e.orderId=(:id)")
	public double getAmount(@Param(value="id") String id); 
}
