package com.example.ebankbackend.services;

import com.example.ebankbackend.dtos.*;
import com.example.ebankbackend.exeptions.BalanceNotSufficientException;
import com.example.ebankbackend.exeptions.BankAccountNotFoundException;
import com.example.ebankbackend.exeptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {


    CustomerDTO saveCostumer(CustomerDTO customerDTO);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, Long customerId, double overDraft) throws CustomerNotFoundException;
    SavingsBankAccountDTO saveSavingsBankAccount(double initialBalance, Long customerId, double interestRate) throws CustomerNotFoundException;

    List<CustomerDTO> listCostumers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;


    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCostumer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    public List<OperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}