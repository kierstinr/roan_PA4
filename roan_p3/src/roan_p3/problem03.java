package roan_p3;
import java.util.Scanner;
public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int rating1, rating2, rating3, rating4, rating5;
		float temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0;
		float total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
		float avg1, avg2, avg3, avg4, avg5;
		int numPeople, i, j, k;
		
		String[] topics = new String[5];
		topics[0] = "Climate Change";
		topics[1] = "Student Debt";
		topics[2] = "Affordable Healthcare";
		topics[3] = "Animal Testing";
		topics[4] = "Minimum Wage";
		
		
		int[][] responses = new int[5][10];
		
		for(j = 0; j < 5; j++) {
			for(k = 0; k < 10; k++) {
				responses[j][k] = 0;	
			}
		}
		
		System.out.println("How many people are taking the survey?");
		numPeople = scnr.nextInt();
		
		for (i = 0; i < numPeople; i++) {
		System.out.println("Participant " + (i + 1) + ", rate: " + topics[0] + ".");
		rating1 = scnr.nextInt();
		total1 = temp1 + rating1;
		temp1 = total1;
		
		if(rating1 == 1)
			responses[0][0]++;
		if(rating1 == 2)
			responses[0][1]++;
		if(rating1 == 3)
			responses[0][2]++;
		if(rating1 == 4)
			responses[0][3]++;
		if(rating1 == 5)
			responses[0][4]++;
		if(rating1 == 6)
			responses[0][5]++;
		if(rating1 == 7)
			responses[0][6]++;
		if(rating1 == 8)
			responses[0][7]++;
		if(rating1 == 9)
			responses[0][8]++;
		if(rating1 == 10)
			responses[0][9]++;
		}
		
		
		
		for (i = 0; i < numPeople; i++) {
		System.out.println("Participant " + (i + 1) + ", rate: " + topics[1] + ".");
		rating2 = scnr.nextInt();
		total2 = temp2 + rating2;
		temp2 = total2;
		
		if(rating2 == 1)
			responses[1][0]++;
		if(rating2 == 2)
			responses[1][1]++;
		if(rating2 == 3)
			responses[1][2]++;
		if(rating2 == 4)
			responses[1][3]++;
		if(rating2 == 5)
			responses[1][4]++;
		if(rating2 == 6)
			responses[1][5]++;
		if(rating2 == 7)
			responses[1][6]++;
		if(rating2 == 8)
			responses[1][7]++;
		if(rating2 == 9)
			responses[1][8]++;
		if(rating2 == 10)
			responses[1][9]++;
		}

		
		for (i = 0; i < numPeople; i++) {
		System.out.println("Participant " + (i + 1) + ", rate: " + topics[2] + ".");
		rating3 = scnr.nextInt();
		total3 = temp3 + rating3;
		temp3 = total3;
		
		if(rating3 == 1)
			responses[2][0]++;
		if(rating3 == 2)
			responses[2][1]++;
		if(rating3 == 3)
			responses[2][2]++;
		if(rating3 == 4)
			responses[2][3]++;
		if(rating3 == 5)
			responses[2][4]++;
		if(rating3 == 6)
			responses[2][5]++;
		if(rating3 == 7)
			responses[2][6]++;
		if(rating3 == 8)
			responses[2][7]++;
		if(rating3 == 9)
			responses[2][8]++;
		if(rating3 == 10)
			responses[2][9]++;
		}
		
		for (i = 0; i < numPeople; i++) {
		System.out.println("Participant " + (i + 1) + ", rate: " + topics[3] + ".");
		rating4 = scnr.nextInt();
		total4 = temp4 + rating4;
		temp4 = total4;
		
		if(rating4 == 1)
			responses[3][0]++;
		if(rating4 == 2)
			responses[3][1]++;
		if(rating4 == 3)
			responses[3][2]++;
		if(rating4 == 4)
			responses[3][3]++;
		if(rating4 == 5)
			responses[3][4]++;
		if(rating4 == 6)
			responses[3][5]++;
		if(rating4 == 7)
			responses[3][6]++;
		if(rating4 == 8)
			responses[3][7]++;
		if(rating4 == 9)
			responses[3][8]++;
		if(rating4 == 10)
			responses[3][9]++;
		}
		
		for (i = 0; i < numPeople; i++) {
		System.out.println("Participant " + (i + 1) + ", rate: " + topics[4] + ".");
		rating5 = scnr.nextInt();
		total5 = temp5 + rating5;
		temp5 = total5;
		
		if(rating5 == 1)
			responses[4][0]++;
		if(rating5 == 2)
			responses[4][1]++;
		if(rating5 == 3)
			responses[4][2]++;
		if(rating5 == 4)
			responses[4][3]++;
		if(rating5 == 5)
			responses[4][4]++;
		if(rating5 == 6)
			responses[4][5]++;
		if(rating5 == 7)
			responses[4][6]++;
		if(rating5 == 8)
			responses[4][7]++;
		if(rating5 == 9)
			responses[4][8]++;
		if(rating5 == 10)
			responses[4][9]++;
		}
		
		avg1 = total1 / numPeople;
		avg2 = total2 / numPeople;
		avg3 = total3 / numPeople;
		avg4 = total4 / numPeople;
		avg5 = total5 / numPeople;
		
		
		System.out.println();
		
		System.out.println("                       1 2 3 4 5 6 7 8 9 10  Averages");
		
		for(j = 0; j < 5; j++) {
			System.out.print(topics[j] + " ");
			
			if (j == 0)
				System.out.print("       ");
			if (j == 1)
				System.out.print("         ");
			if (j == 2)
				System.out.print("");
			if (j == 3)
				System.out.print("       ");
			if (j == 4)
				System.out.print("         ");
			
			for(k = 0; k < 10; k++) {
				
				System.out.print(" " + responses[j][k]);	
			}
			
			if (j == 0)
				System.out.print("   " + avg1);
			if (j == 1)
				System.out.print("   " + avg2);
			if (j == 2)
				System.out.print("   " + avg3);
			if (j == 3)
				System.out.print("   " + avg4);
			if (j == 4)
				System.out.print("   " + avg5);
			
			System.out.println();
		}
	}
}
