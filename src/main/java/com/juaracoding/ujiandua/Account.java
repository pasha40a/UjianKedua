package com.juaracoding.ujiandua;
public class Account {

	int acc_no;
	String name;
	double amount;

	public int insertAcc_no(int a) {
		acc_no = a;
		return a;
	}
	public void insertName(String n) {
		name = n;
	}
	public void insertAmount(double amt) {
		amount = amt;
	}


	public double deposit(double amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");

        return amt;
    }

	public double withdraw(double amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
		return amt;
	}

	public void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	public void display() {
		System.out.println(acc_no + " " + name + " " + amount);

	}


}
