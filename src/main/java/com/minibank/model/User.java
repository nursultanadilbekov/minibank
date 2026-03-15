package com.minibank.model;

import java.util.Objects;

public class User implements Cloneable{
    private String name;
    private double balance;
    private String accountType;

    public User(String name, double balance, String accountType) {
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public User(String name, double balance) {
        this(name, balance, "BASIC");
    }
    public User(String name){
        this(name, 0.0);
    }


    @Override
    public User clone() {
        try{
            return (User)super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException();
        }
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "User [name=" + name +
                ", balance=" + balance +
                ", accountType=" + accountType + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){ return true; }
        if (obj == null || getClass() != obj.getClass()){ return false; }
        User other = (User) obj;
        return Double.compare(balance, other.balance) == 0 &&
                Objects.equals(name, other.name);
    }
}
