package com.ct.bank.service;

import java.util.List;

import com.ct.bank.model.Account;
import com.ct.bank.model.Transaction;

public interface AccountService2 {
	public abstract long createAccount(Account account);

	public abstract Account getAccountDetails(Long accountNo);

	public abstract String withdraw(Long accountNo, int witdrawlAmount);

	public abstract String deposit(Long accountNo, int depositAmount);

	public abstract String fundtransfer(Long fromAccountNo, Long toAccountNo, int transferAmount);

	public abstract List<Transaction> printTransactions();
}
