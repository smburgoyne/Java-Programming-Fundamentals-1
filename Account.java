class Account {
	private double balance;
	
	public Account(double balance) {
		this.setBalance(balance);
	}
	
	public void setBalance(double balance)
	{
		if(balance < 0)
		{
			throw new RuntimeException("Cannot be negative.");
		}
		
		this.balance = balance;
	}
	public void withdraw(double amt) {
		if(amt < 0)
		{
			throw new RuntimeException("Cannot be negative.");
		}
		if(amt > balance)
		{
			throw new RuntimeException("Cannot withdraw more than balance.");
		}
		balance = balance - amt;
	}
	
	public void deposit(double amt) {
		if(amt < 0)
		{
			throw new RuntimeException("Cannot cannot be negative.");
		}
		balance = balance + amt;
	}
	public double getBalance() {
		return balance;
	}
}