package assignments.lab2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of males registered:");
		double numOfMales=sc.nextInt();
		System.out.print("Enter number of males registered:");
		double numOfFemales=sc.nextInt();
		double percentageOfMales=numOfMales/(numOfMales+numOfFemales)*100;
		double percentageOfFemales=numOfFemales/(numOfMales+numOfFemales)*100;
		System.out.println("Percentage of males: " + percentageOfMales);
		System.out.println("Percentage of females: " + percentageOfFemales);
	}
	

}
