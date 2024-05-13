package java101Projects;

import java.util.Scanner;

public class password_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username, password;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Username: ");
		username = input.nextLine();

		System.out.println("Password: ");
		password = input.nextLine();
		
		if(username.equals("gamzegezgin") && password.equals("1234567")) {
			System.out.println("Approved");
		}else {
			System.out.println("Denied");
		}
				
	}

}
