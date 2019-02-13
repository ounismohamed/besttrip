package com.test.besttrip.service;

import com.test.besttrip.model.Account;
import com.test.besttrip.model.AccountType;
import com.test.besttrip.model.Experience;
import com.test.besttrip.model.repository.AccountRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public Iterable<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccount(String login){
        return accountRepository.findByLogin(login);
    }

    public void createAccount(Account account){
        accountRepository.save(account);
    }


}
