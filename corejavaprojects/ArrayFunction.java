package corejavaprojects;

import java.util.Scanner;

public class ArrayFunction {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		
			
		}
		int max=arr[0];
		for( int i=0;i<n;i++) {
			
		System.out.println(arr[i]);
		
		

	}
		System.out.println("reversing a array:");
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
System.out.println("maximum number of an element:");
for( int i=1;i<n;i++) {
	

if(arr[i]>max) {
	max=arr[i];
	
}
}
System.out.println( "the maximum element is:"+max);


}
}
