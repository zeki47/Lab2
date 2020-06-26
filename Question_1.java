package assignments.lab2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		int num, nextNum, smallest, largest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number:");
		
		num=sc.nextInt();
		
		System.out.print("Enter your next number:");
		
		nextNum=sc.nextInt();
		
		if(num>nextNum) {
			largest=num;
			smallest=nextNum;
		}else {
			largest=nextNum;
			smallest=num;
		}
		
		do {
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			int answer=sc.nextInt();
			if(answer==1) {
				System.out.print("Enter your next number:");
				nextNum=sc.nextInt();
				if(nextNum>largest) {
					largest=nextNum;
				}else if(nextNum<smallest) {
					smallest=nextNum;
				}
			}else if(answer==0) {
				break;
			}
			
		}while(true);
		
		System.out.println("Smallest number is: " + smallest);
		System.out.println("Largest number is: " + largest);
		
	}

}
