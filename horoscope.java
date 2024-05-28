package java101Projects;

import java.util.Scanner;

public class horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("write number of month which you born: ");
		int  month = input.nextInt();
		System.out.println("write number of day which you born: ");
		int day = input.nextInt();
		String result = "";
		
		if(month>=0 && month<12) {
			if(day>=0 && day<31) {
				if(month==1) {
			        result = (day>=22) ? "Kova" : "Oğlak";
					}
				else if(month==2) {
			        result = (day>=20) ? "Balık" : "Kova";
					}
				else if(month==3) {
			        result = (day>=21) ? "Koç" : "Balık";
					}
				else if(month==4) {
			        result = (day>=21) ? "Boğa" : "Koç";
					}
				else if(month==5) {
			        result = (day>=22) ? "İkizler" : "Boğa";
					}
				else if(month==6) {
			        result = (day>=23) ? "Yengeç" : "İkizler";
					}
				else if(month==7) {
			        result = (day>=23) ? "Aslan" : "Yengeç";
					}
				else if(month==8) {
			        result = (day>=23) ? "Başak" : "Aslan";
					}
				else if(month==9) {
			        result = (day>=23) ? "Terazi" : "Başak";
					}
				else if(month==10) {
			        result = (day>=23) ? "Akrep" : "Terazi";
					}
				else if(month==11) {
			        result = (day>=22) ? "Yay" : "Akrep";
					}
				else if(month==12) {
			        result = (day>=20) ? "Oğlak" : "Yay";
					}
			}else {
				System.out.println("Please write valid day");
			}

		}else {
			System.out.println("Please write valid month");
		}
		  System.out.println(result);	
			
		  
		  input.close(); 
		

		}

	}


