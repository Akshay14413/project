package com.cg.proj.EmailProj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.proj.EmailProj.bean.CustomerBean;
import com.cg.proj.EmailProj.bean.MerchantBean;




@Repository
public interface EmailRepo extends JpaRepository<CustomerBean, String> {
	@Query(value="SELECT c.email FROM CustomerBean c WHERE c.customerName=(:name)")
	public String findCustomerEmail(@Param(value="name") String name);
	
	@Query(value="SELECT c FROM CustomerBean c Where c.email=(:email)")
	public CustomerBean findCustomer(@Param(value="email") String email);
	
	@Query(value="SELECT m FROM MerchantBean m Where m.emailId=(:email)")
	public MerchantBean findMechant(@Param(value="email") String email);
	

}
