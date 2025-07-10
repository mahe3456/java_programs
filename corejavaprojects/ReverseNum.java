package corejavaprojects;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int number=sc.nextInt();
		int reversnum=0;
		for( ;number>0;number/=10) {
			int digit=number%10;
			reversnum=reversnum*10+digit;
		}
		
		System.out.println(reversnum);

	}

}
