package corejavaprojects;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to check weather the number is prime or not:");
	int num=sc.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	//System.out.println(count);
if(count==2) {
	System.out.println("the number is prime");
	}
else {
	System.out.println("not prime");
	
}

	}
}


