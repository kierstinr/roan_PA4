package roan_p2;
import java.util.Scanner;
public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int option;
		float height, weight, bmi;
		
		
		System.out.println("1. Use formula for inches and pounds."
				+ "\n2. Use formula in meters and kilograms."
				+ "\nEnter 1 or 2 to select a formula.\n");
		option = scnr.nextInt();
		int i = 0;
		
		if (option == 1) {
			System.out.println("Enter height in inches:");
			height = scnr.nextFloat();
			
			System.out.println("Enter weight in pounds:");
			weight = scnr.nextFloat();
			
			bmi = (703 * weight) / (height * height);
			
			System.out.println("Your BMI is: " + bmi);
			
			System.out.println("\nBMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater\n");	
		}
		
		if (option == 2) {
			System.out.println("Enter height in meters:");
			height = scnr.nextFloat();
			
			System.out.println("Enter weight in kilograms:");
			weight = scnr.nextFloat();
			
			bmi = (weight) / (height * height);
			
			System.out.println("Your BMI is: " + bmi);
			
			System.out.println("\nBMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater\n");
		}
		i++;
	}
}
