package javacore_class;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerNameString;
	private String phone;
	private String mail;

	public BankAccount() {

	}

	public void withDrawn(double amount) {
		if (amount >= this.getBalance())
			System.out.println("Your money not enough");
		else {
			this.setBalance(this.getBalance() - amount);
			System.out.println("Get money successfully! Your current balance: " + this.getBalance());
		}
	}

	public void deposit(double amount) {
		if (amount >= 0) {
			this.setBalance(this.getBalance() + amount);
			System.out.println("Send money to account successfully! Your current balance: " + this.getBalance());
		} else 
			System.out.println("Amount invalid");
			
	}

	public BankAccount(String accountNumber, double balance, String customerNameString, String phone, String mail) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerNameString = customerNameString;
		this.phone = phone;
		this.mail = mail;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerNameString() {
		return customerNameString;
	}

	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
