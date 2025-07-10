package corejavaprojects;

import java.util.Scanner;

public class LowercaseStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String name=sc.nextLine();
		String str=sc.nextLine();
		
		System.out.println("case changing:" + name.toLowerCase());
		System.out.println("case changing:" + name.toUpperCase());
		System.out.println("strip:" + name.strip());
		System.out.println("concat:" + name.concat(str));
		System.out.println("length:" + name.length());
		System.out.println("case changing:" + name.toCharArray());
		

	}

}
