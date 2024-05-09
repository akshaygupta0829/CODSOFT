package task3;

import java.util.Scanner;

class Bank_Account{
	
	String name;
	String userName;
	String password;
	String accountNo;
	double balance=5000f;
	int transactions=0;
	String transactionHistory="";
	
	
	public void register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter your Name:");
		this.name=sc.nextLine();
		System.out.println("Enter your UserName:");
		this.userName=sc.nextLine();
		System.out.println("Enter your Password:");
		this.password=sc.nextLine();
		System.out.println("Enter your Account Number:");
		this.accountNo=sc.nextLine();
		System.out.println("\nRegistration Successful.\nPlease Login to your Bank Account");
	}	
	
	public boolean login() {
		boolean isLogin=false;
		Scanner sc=new Scanner(System.in);
		
		while(!isLogin) {
			System.out.println("\nEnter your username");
			String user=sc.nextLine();
			if(userName.equals(user)) {
				
				while(!isLogin) {
					System.out.println("Enter Your password");
					String password=sc.nextLine();
					if(password.equals(password)) {
						System.out.println("\nLogin Successful");
						isLogin=true;
					}
					else {
						System.out.println("\nIncorrect password");
					}
				}
			}
			else {
				System.out.println("\nUsername not found...Please enter valid username");
			}
		}
		return isLogin;
	}
	
	public void withDraw() {
		System.out.println("Enter Amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		try {
			if(balance>=amount) {
				transactions++;
				balance-=amount;
				System.out.println("Withdraw Successful.");
				String str=amount+"Rs withdraw";
				transactionHistory = transactionHistory.concat(str);
			}else {
				System.out.println("Insufficient balance");
			}
		}catch(Exception ex){
			
		}
	}
	
	public void deposite() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Amount to Deposite: ");
		float amount=sc.nextFloat();
		try {
			
				transactions++;
				balance += amount;
				System.out.println("Deposite Successful.");
				String str=amount+"Rs deposited";
				transactionHistory = transactionHistory.concat(str);
			
		}catch(Exception ex){
			
		}
	}
	
	public void checkBalance() {
		System.out.println("\nBalance: "+balance+"0Rs");
	}
	
	public void transactionHistory() {
		if(transactions == 0) {
			System.out.println("No Transaction happened");
		}
		else {
			System.out.println("\n "+transactionHistory);
		}		
	}
}

