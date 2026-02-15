package com.optionalinterface.bankingapplication;
import java.util.* ;

public class BankAccount {

	int id;
    String holder;
    Optional<String> nominee;
    Optional<String> loanDetails;
    Optional<Double> balance;
    Optional<String> transactionRef;
    Optional<String> creditCard;

    //constructor
    public BankAccount(int id, String holder, String nominee, String loanDetails,
                Double balance, String transactionRef, String creditCard) {
        this.id = id;
        this.holder = holder;
        this.nominee = Optional.ofNullable(nominee);
        this.loanDetails = Optional.ofNullable(loanDetails);
        this.balance = Optional.ofNullable(balance);
        this.transactionRef = Optional.ofNullable(transactionRef);
        this.creditCard = Optional.ofNullable(creditCard);
    }

}
