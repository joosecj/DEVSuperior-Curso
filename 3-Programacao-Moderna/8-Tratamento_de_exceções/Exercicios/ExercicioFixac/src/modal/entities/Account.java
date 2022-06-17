package modal.entities;

import modal.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private double withdrawLimit;

    public Account(){
    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if(balance <= 0){
            throw  new DomainException("Invalid opening balance");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        if(amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new DomainException("Not enough balance");
        }
        balance -= amount;
    }
}
