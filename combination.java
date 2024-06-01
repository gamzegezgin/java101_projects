package java101Projects;

import java.util.Scanner;

public class combination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter r: ");
        int r = scanner.nextInt();
        
        scanner.close();
        
        if (n >= r && n >= 0 && r >= 0) {
            int nFactorial = 1;
            int rFactorial = 1;
            int nrFactorial = 1;

            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }
            
            for (int i = 1; i <= r; i++) {
                rFactorial *= i;
            }
            
            for (int i = 1; i <= (n - r); i++) {
                nrFactorial *= i;
            }
            
            int combination = nFactorial / (rFactorial * nrFactorial);
            
            System.out.println("Combination C(" + n + ", " + r + ") = " + combination);
        } else {
            System.out.println("Invalid input!");
        }
    }
}

