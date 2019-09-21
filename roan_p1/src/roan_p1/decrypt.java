package roan_p1;

import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4;
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter number 1:");
		num1 = scnr.nextInt();
		
		System.out.print("Enter number 2:");
		num2 = scnr.nextInt();
		
		System.out.print("Enter number 3:");
		num3 = scnr.nextInt();
		
		System.out.print("Enter number 4:");
		num4 = scnr.nextInt();
		
		int temp1, temp2;
		
		temp1 = num1;
		temp2 = num2;

		num1 = num3;
		num3 = temp1;
		num2 = num4;
		num4 = temp2;
		
		if (num1 >= 7 && num1 <= 9)
			num1 = num1 % 10;
		else
			num1 += 10;
		
		if (num2 >= 7 && num2 <= 9)
			num2 = num2 % 10;
		else
			num2 += 10;
		
		if (num3 >= 7 && num3 <= 9)
			num3 = num3 % 10;
		else
			num3 += 10;
		
		if (num4 >= 7 && num4 <= 9)
			num4 = num4 % 10;
		else
			num4 += 10;
		
		num1 -= 7;
		num2 -= 7;
		num3 -= 7;
		num4 -= 7;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + " ");
		System.out.println(num4);
	}
}
