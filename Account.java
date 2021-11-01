package main;

public class Account {
	private AccountHolder holder;
	private double balance = 0.0;
	public Account(double amt, AccountHolder holder){
	this.balance=balance+amt;
	this.holder = holder;
	}
	public double deposit(double amt){
	return balance = balance+amt;
	}
	public boolean withdraw(double amt){
	if(amt<balance){
	balance-=amt;
	return true;
	}
	else{
	return false;
	}
	}
	public AccountHolder getHolder(){
	return holder;
	}
	public void SetBalance(double amt){
	balance=amt;
	}
	public void setHolder(AccountHolder holder){
	this.holder=holder;
	}

}
