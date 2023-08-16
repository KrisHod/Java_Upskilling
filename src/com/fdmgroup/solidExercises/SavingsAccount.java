package com.fdmgroup.solidExercises;

public class SavingsAccount implements Account {
    private boolean hasInterestPayment;
    private boolean hasInterestCharge;
    private String accountNumber;
    private String accountName;
    private double balance;
    private int PIN;
    
    public SavingsAccount(boolean hasInterestPayment, boolean hasInterestCharge, String accountNumber,
			String accountName, double balance, int pIN) {
		super();
		this.hasInterestPayment = hasInterestPayment;
		this.hasInterestCharge = hasInterestCharge;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		PIN = pIN;
	}

	public boolean isHasInterestPayment() {
		return hasInterestPayment;
	}

	public void setHasInterestPayment(boolean hasInterestPayment) {
		this.hasInterestPayment = hasInterestPayment;
	}

	public boolean isHasInterestCharge() {
		return hasInterestCharge;
	}

	public void setHasInterestCharge(boolean hasInterestCharge) {
		this.hasInterestCharge = hasInterestCharge;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        // Deposit logic
    }
    
    @Override
    public void withdraw(double amount) {
        // Withdraw logic
    }
}