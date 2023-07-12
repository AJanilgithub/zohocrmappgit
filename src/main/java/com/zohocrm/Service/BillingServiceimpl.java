package com.zohocrm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.controller.Billing;
import com.zohocrm.repository.BillingRepository;

@Service
public class BillingServiceimpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);

	}

}
