package java101Projects;
import java.util.*;

public class dataTypes {

	class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();  // Number of test cases
	        sc.nextLine();  // Consume the newline left after reading the integer

	        for (int i = 0; i < t; i++) {
	            String input = sc.nextLine();  // Read the entire line as string to safely handle large inputs
	            try {
	                long x = Long.parseLong(input);  // Parse the string as a long
	                System.out.println(x + " can be fitted in:");
	                if (x >= -128 && x <= 127) {
	                    System.out.println("* byte");
	                }
	                if (x >= -32768 && x <= 32767) {
	                    System.out.println("* short");
	                }
	                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
	                    System.out.println("* int");
	                }
	                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
	                    System.out.println("* long");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println(input + " can't be fitted anywhere.");
	            }
	        }
	        sc.close();
	    }
	}


}
