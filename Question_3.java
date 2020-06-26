package assignments.lab2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		int num, sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		num=sc.nextInt();
		sum=0;
		
		for(int i=1;i<num;i++) {
			
			sum=sum+i;
			
		}
		
		System.out.println("Total is: " + sum);
		
	}

}
