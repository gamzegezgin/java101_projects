package java101Projects;

import java.util.Scanner;

public class reverse {

	class Main {

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    char ch;
		    String reverse = "";
		    System.out.print("Input: "); 
		    String words = s.nextLine();
		    
		  for(int i=0; i<words.length(); i++){
		  ch = words.charAt(i);
		  reverse = ch+reverse;

		  }

		       System.out.print("Output: "+ reverse); 


		  }

		}
}
