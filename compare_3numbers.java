package java101Projects;

import java.util.Scanner;

public class compare_3numbers {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER 3 NUMBER");
		
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		
		if(n1>n2 && n1>n3) {
			if(n2>n3) {
				System.out.println(n1 +", "  + n2 +", "  + n3);
			}else {
				System.out.println(n1 +", "  + n3 +", "  + n2);
			}
		}else if(n2>n3 && n2>n1) {
			if(n3>n1) {
				System.out.println(n2 +", " +n3+", " + n1 );
			}else {
				System.out.println(n2 + ", "+ n1 + ", " + n3);
			}
		}else {
			if(n2>n1) {
				System.out.println(n3+", "+n2+ ", "+n1);
			}else {
				System.out.println(n3+", "+n1+", "+n2);
			}
		}
		
	}

}
