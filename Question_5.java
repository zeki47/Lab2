package assignments.lab2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter meal charge:");
		double mealCharge=sc.nextInt();
		
		double tax=mealCharge*0.0675;
		
		double tip=(mealCharge+tax)*0.2;
		
		double totalBill=mealCharge+tax+tip;
		
		System.out.println("Meal charge: " + mealCharge + " tax amount: " + tax + " tip amount: " + tip + " total bill: " + totalBill);

	}

}
