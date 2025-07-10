package corejavaprojects;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to reverse:");
		String name=sc.nextLine();
		String revesed="";
		for(int i=name.length()-1;i>=0;i--) {
			
			revesed=revesed+name.charAt(i);
			
		}
System.out.println("reversed string:"+revesed);
	}

}
