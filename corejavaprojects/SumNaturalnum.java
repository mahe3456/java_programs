package corejavaprojects;
import java.util.Scanner;

public class SumNaturalnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
			
		}
System.out.println("the sum is:"+sum);
	}

}
