package java101Projects;

import java.util.Scanner;

public class money_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String userName, password;
		int right=3;
		int balance = 1500;
		int select;
		double takeOutMoney, payInMoney;
		while(right>0){
			System.out.println("Enter username: ");
			userName = input.nextLine();
			
			System.out.println("Enter password: ");
			password = input.nextLine();
			
			if(userName.equals("username")&& password.equals("password")) {
				System.out.println("Welcome to Kapital Bank!");

				do {
					System.out.println("Choose process that you want to do: \n" + "1-Take out money\n" + "2-Pay money in\n" + "3-Balance inquiry\n" +  "4-Quit\n");
					select = input.nextInt();
					
					switch(select) {
					case 1 :
						System.out.println("Enter money that you want to take out: ");
						takeOutMoney = input.nextDouble();
						balance-=takeOutMoney;
						System.out.println("Your new balance is: "+ balance);
						break;
					
					case 2 :	
						System.out.println("Enter money that you want to pay in: ");
						payInMoney = input.nextDouble();
						balance+=payInMoney;
						System.out.println("Your new balance is: "+ balance);
						break;
					
					case 3 :
						System.out.println("Your balance is: "+ balance);
						break;
					
					case 4 :
						System.out.println("Goodbye");
						break;
						
					default :
						System.out.println("Choose a valid option");
					}
				
						
				}while(select!=4);
				
				break; //bu sayede kullanıcı doğru bilgileri girdiğinde tekrar giriş bilgileri sormaz
			}else{
				right--;
				System.out.println("Try again.");
				if(right ==0) {
					System.out.println("Account is blocked.");
				}else{
					System.out.println("Available rights = "+ right);

			}
			}
		}
		
		
		
	}

}
