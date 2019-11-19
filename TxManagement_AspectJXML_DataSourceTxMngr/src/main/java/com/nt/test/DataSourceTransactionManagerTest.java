package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nt.serviceImpl.service.BankService;

public class DataSourceTransactionManagerTest {

	public static void main(String[] args) {

		ApplicationContext context = null;
		BankService proxy = null;
		// create IOC Container
		context = new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
		// get proxy obj
		proxy = context.getBean("bankService", BankService.class);

		// invoke Bus method
		  proxy.moneyTransfer(4, 1, 15000);
	}

}
