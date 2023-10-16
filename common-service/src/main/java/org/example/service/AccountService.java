package org.example.service;

import org.example.model.Account;

import java.util.List;

public interface AccountService {
    Account create(Account account);
    Account readById(Long accountId);
    Account update(Account account);
    void delete(Account account);
    List<Account> getAll();
}
