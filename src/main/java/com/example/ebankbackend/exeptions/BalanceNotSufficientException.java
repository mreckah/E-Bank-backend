package com.example.ebankbackend.exeptions;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String balanceNotSufficient) {
        super(balanceNotSufficient);
    }
}
