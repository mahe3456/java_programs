package corejavaprojects;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter a string to check weather an element is palindrome or not");
String str= sc.nextLine();
//palindrome function
String temp="";
for(int i=str.length()-1;i>=0;i--) 
{
	temp= temp+str.charAt(i);
}
System.out.println(temp);
if(temp.equalsIgnoreCase(str)) {
	System.out.println("it's a palimdrome");
}
else {
	System.out.println("not an palindrome");
}
	
	}

}
