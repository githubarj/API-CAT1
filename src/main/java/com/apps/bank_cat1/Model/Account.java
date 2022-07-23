package com.apps.bank_cat1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ACCOUNT")
public class Account {

    @Id
    @Column (name = "BANK_NAME")
    private String bankName;
    @Column (name = "ACCOUNT_ID")
    private Long accountId;
    @Column (name = "CUSTOMER_ID")
    private Long customerId;
    @Column (name = "BALANCE")
    private float balance;
    @Column (name = "LOAN_BALANCE")
    private float loanBalance;

    public Account(String bankName, Long accountId, Long customerId, float balance, float loanBalance) {
        this.bankName = bankName;
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
        this.loanBalance = loanBalance;
    }

    public Account() {

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(float loanBalance) {
        this.loanBalance = loanBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", loanBalance=" + loanBalance +
                '}';
    }
}
