package java101Projects;
import java.text.DecimalFormat;
import java.util.Scanner;

public class vat_calculator {

	public static void main(String[] args) {
		
		double price;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the price: ");
		price = input.nextDouble();
		
		double priceWithVat = price + price*0.18;
		
		double vatAmount = price*0.18;
		
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedPriceWithVat = df.format(priceWithVat);
        String formattedVatAmount = df.format(vatAmount);

        System.out.println("Value Added Tax amount: " + formattedPriceWithVat + "\n" + "Amount of Tax: " + formattedVatAmount);
		

	}

}
