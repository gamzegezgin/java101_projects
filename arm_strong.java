package java101Projects;

import java.util.Scanner;

public class arm_strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		int count=0;
		int sum=0;
        int originalInteger = integer; 
		
		while(integer != 0) {
			integer/=10;
			count+=1;
			
		}
		
		integer = originalInteger;
		
        while (integer != 0) {
            int digit = integer % 10;
            sum += Math.pow(digit, count);
            integer /= 10;
        }
        
		if(sum==originalInteger) {
			System.out.println("armstrong number");

		}else {
			System.out.println("not armstrog number");
		}
	}

}
