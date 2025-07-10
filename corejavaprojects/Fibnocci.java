package corejavaprojects;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
int firstnumber=0;
int secondnumber=1;
int thirdnumber=0;
System.out.println(firstnumber);
System.out.println(secondnumber);
for(int i=0;i<num;i++) {
	thirdnumber=firstnumber+secondnumber;
	System.out.println(thirdnumber);
	firstnumber=secondnumber;
	secondnumber=thirdnumber;
}
	}

}
