package assignments.lab2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		int caloriesOfCookie=300/(40/10);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of cookies you ate:");
		int numOfCookies=sc.nextInt();
		int totalCalories=numOfCookies*caloriesOfCookie;
		
		System.out.println("Number of total calories consumed: " + totalCalories);

	}

}
