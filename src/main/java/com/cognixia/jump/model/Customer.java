package com.cognixia.jump.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	double balance = 0;
	public String username;
	private String password;
	private List<Customer> accounts;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = 0.0;
		this.username = username;
		this.password = password;
		accounts = new ArrayList<Customer>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Customer> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Customer> accounts) {
		this.accounts = accounts;
	}

	public void deposit(double money) {
		this.balance += money;
	}

	public void withdraw(double money) {
		this.balance -= money;
	}
	
	public void transfer(double money) {
		this.balance -= money;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + ", username="
				+ username + "]";
	}

	

}
