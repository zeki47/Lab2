package assignments.lab2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter amount of purchase:");
		
		double amountOfPurchase=sc.nextInt();
		
		double stateSalesTax=amountOfPurchase*0.04;
		double countySalesTax=amountOfPurchase*0.02;
		double totalTax=stateSalesTax+countySalesTax;
		double totalOfSale=amountOfPurchase+totalTax;
		
		System.out.println("Amount of purchase: " + amountOfPurchase + ", the state sales tax: " + stateSalesTax + ", the county sales tax: " + countySalesTax +", total sales tax: " + totalTax + ", total of the sale: " + totalOfSale );

	}

}
