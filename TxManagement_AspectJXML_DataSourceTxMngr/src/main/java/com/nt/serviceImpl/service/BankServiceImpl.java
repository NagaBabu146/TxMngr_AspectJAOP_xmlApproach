package com.nt.serviceImpl.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	
	private BankDAO dao;
	
	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}


	@Override
	public String moneyTransfer(int srcNo, int destNo, int amt) {
		
		int count1=0;
		int count2=0;
		count1=dao.withdraw(srcNo, amt);
		count2=dao.deposit(destNo, amt);
		
		if(count1==0||count2==0) {
			throw new IllegalArgumentException("Incomplete Details and Invalid account(Tx Rollback");
		}else {
			System.out.println("MoneyTransfer Succesfully(Tx Commited)");
		}
	
		return "Money Transfer Successfully";
	}

}
