package com.example.ebankbackend.dtos;

import com.example.ebankbackend.enums.AccountStatus;
import lombok.Data;

import java.util.Date;

@Data
public class SavingsBankAccountDTO extends BankAccountDTO{
    private String id;
    private Date createdAt;
    private double balance;
    private AccountStatus status;
    private String currency;
    private double interestRate;
    private CustomerDTO customerDTO;

}
