package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	
	private static final String WITHDRAW_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	private static final String DEPOSIT_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
	private JdbcTemplate jdbcTemplate;

	public BankDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int withdraw(int acno, int amt) {
		return 	jdbcTemplate.update(WITHDRAW_QUERY, amt,acno);
	
	}

	@Override
	public int deposit(int acno, int amt) {// TODO Auto-generated method stub
		return jdbcTemplate.update(DEPOSIT_QUERY, amt,acno);
	}

}
