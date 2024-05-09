package task3;

import java.util.Scanner;

public class Atm_Interface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Bank_Account b = new Bank_Account();
		
		int choice ;
		System.out.println("WELCOME TO CodSoft ATM");
		System.out.println("\n1.Register \n2.exit");
		System.out.println("choose one option:");
		int a = sc.nextInt();
		if(a == 1) {
			b.register();
			
				if(b.login()) {					
					  System.out.println("\n-------- Welcome Back "+b.name +" --------");
				
					do {
						  System.out.println("\n1.Withdraw \n2.Deposite \n3.Check Balance \n4.Transaction History \n0.Exit");
						  System.out.println("Enter Your Choice:");
						  choice = sc.nextInt();
						  switch(choice) {
							  case 1:
								  b.withDraw();
								  break;
								  
							  case 2:
								  b.deposite();
								  break;
								  
							  case 3:
								  b.checkBalance();
								  break;
								  
							  case 4:
								  b.transactionHistory();
								  break;
								  
							  case 0:
								  System.out.println("     Thank You..."+ b.name + "\n     Visit Again...! ");
								  break;
								  
							  default:
						   			System.out.println("\nPlease select valid option");
						   			break;
							  }
						
					}while(choice != 0);
			}	
			
		}else {
			System.exit(0);
		}
		
	}				

}
