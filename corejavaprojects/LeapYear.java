package corejavaprojects;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a year to check weather the number is leap year or not:");
int year=sc.nextInt();
if(year%4==0) {
	if(year%100!=0||year%400==0) {
		System.out.println("its a leap year");
	}
}
	else {
		
			System.out.println("its not an  leap year");
		
	}




	}

}
