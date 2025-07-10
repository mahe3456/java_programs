package corejavaprojects;
import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter length of first array:");
int n1=sc.nextInt()	;
System.out.println("enter length of second array:");
int n2=sc.nextInt()	;
System.out.println("enter first arrays:");
	int arr1[]=new int[n1];
for(int i=0; i<n1;i++) 
{
	arr1[i]=sc.nextInt();
}
System.out.println("enter second arrays:");
int arr2[]=new int[n2];
for(int i=0; i<n2;i++) 
{
arr2[i]=sc.nextInt();
}

int merge=n1+n2;
int arr3[]=new int[merge];
for( int i=0;i<n1;i++) {
arr3[i]=arr1[i];

}
for(int i=0;i<n2;i++) {
	arr3[n1+i]=arr2[i];
	
}
int large=0;
for(int i=0;i<merge;i++) {
System.out.println(arr3[i]);
if (arr3[i]>large) {
	large=arr3[i];
}

}
System.out.println( "largest number is:"+large);
	}
	

}
