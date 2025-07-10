package corejavaprojects;
import java.util.Scanner;
public class Ivrclass {
	 static Scanner sc=new Scanner(System.in);
	public static void menu() {
		System.out.println("1-additon");
		System.out.println("2-subtraction");
		System.out.println("3-multiplication");
		System.out.println("4-division");
		System.out.println("5-modulo");
		System.out.println("6-swap");
		System.out.println("7-even/odd");
		System.out.println("8-prime");
		System.out.println("9-greater number");
	    System.out.println("10-factorial");
	    System.out.println("11-fibnocci series");
		System.out.println("12-sum of the digits");
		System.out.println("13-reverse a number");
	
		
		System.out.println("0-exit");
		
	}

 public  static void add()
{
	System.out.println("enter two numbers to add:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	System.out.println(c);
}
 public  static void mul()
{
	System.out.println("enter two numbers to multiply:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a*b;
	System.out.println(c);
}
 public  static void sub()
{
	System.out.println("enter two numbers to subtraction:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a-b;
	System.out.println(c);
}
 public  static void div()
 {
 	System.out.println("enter two numbers to divide:");
 	int a=sc.nextInt();
 	int b=sc.nextInt();
 	int c=a/b;
 	System.out.println(c);
 }
 public static void modulo() {
	 System.out.println("enter two numbers to perform modulo:");
	 	int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	int c=a%b;
	 	System.out.println(c);
	 
 }
 public static void swap() {
	 System.out.println("enter two numbers to swap:");
	 int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	a=a^b;
	 	b=a^b;
	 	a=a^b;
	 	System.out.println("a:"+a+"b:"+b);
	 			
 }
 public static void evenOrOdd() {
	 System.out.println("enter a numbers to  check if it is even or odd:");
	 int a=sc.nextInt();
	 if(a/2==0) {
		 System.out.println("it's an even number");
	 }
	 else {
		 System.out.println("it's odd numbere");
	 }
	 
	 			
 }
 public static void greaterNumber() {
	 System.out.println("enter two numbers to swap:");
	 int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	if(a>b) {
	 		System.out.println(a+"is greater than "+b);
	 		
	 	}
	 	else {
	 		System.out.println(b+"is greater than "+a);
	 		
	 	}
	 			
 }
 public static void prime() {
	 System.out.println("enter a number to check if it is prime or not:");
	 int a=sc.nextInt();
	 int count=0;
	 for(int i=1;i<=a;i++) {
		 if(a%i==0) {
			 count++;
			 
		 }
		 
	 }
	 if(count==2) {
		 System.out.println("it's a prime number");
	 }
	 else {
		 System.out.println("it's not a prime number");
	 }
 }
 public static void factorial() {
	 System.out.println("enter a number to find factorial");
	 int a=sc.nextInt() ;
	 int fact=1;
	 for(int i=1;i<=a;i++) {
		 fact=fact*i;
		 }
	 System.out.println("the factorial of"+a+"is"+fact);
	 }
 public static void fibinocci() {
	 System.out.println("enter a number to find fibinocci series");
	 int n=sc.nextInt()	;
	 int a=0 ;
	 int b=1;
	 int fib=0;
	 System.out.println(a);
	 System.out.println(b);
	 for(int i=1;i<=n;i++) {
		 fib=a+b;
		 System.out.println(fib);
		 a=b;
		 b=fib;
		 }
	 
	 }
 public static void sumOfDigits() {
	 System.out.println("enter a number to find sum of its digits");
	 int a=sc.nextInt() ;
	 int sum=0;
	while(a>0){
		sum=sum+a%10;
		a=a/10;
		
		
		 }
	 System.out.println("the sum of the digits is:"+sum);
	 }

public static void reverseNum() {
System.out.println("enter a number to find reverse of that number:");
int a=sc.nextInt() ;
int reverse=0;
while(a>0){
	reverse=reverse*10+a%10;
	a=a/10;
	
	
	 }
System.out.println("the reverse of number is:"+reverse);
}
 
	public static void main(String[] args) {
	

	System.out.println("hurray! lets play with numbers");

	menu();
	boolean choice=true;
	int userchoice=sc.nextInt();
	while(choice) {
		
		if(userchoice==1) {
		add();
System.out.println("do you want to add again:");
System.out.println("1-yes  0-no");
int yesOrNo=sc.nextInt();
if(yesOrNo==1) {
	add();
	System.out.println("do you want to add again:");
	System.out.println("1-yes  0-no");
	
}
else{
	
    menu();
   
    userchoice=sc.nextInt();
	
	
   
}

}

		
	else if(userchoice==2) {
		
		sub();
		System.out.println("do you want to subtract again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			sub();
			System.out.println("do you want to subtract again:");
			System.out.println("1-yes  0-no");
			
		}
		else {
		
			menu();
			 userchoice=sc.nextInt();
		}
	
}
else if(userchoice==3) {
		
		mul();
		System.out.println("do you want to multiply again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			mul();
			System.out.println("do you want to multiply again:");
			System.out.println("1-yes  0-no");
			
		}
		else {
			
			menu();
			 userchoice=sc.nextInt();
		}
	
}
else if(userchoice==4) {
	
	div();
	System.out.println("do you want to divide again:");
	System.out.println("1-yes  0-no");
	int yesOrNo=sc.nextInt();
	if(yesOrNo==1) {
		div();
		System.out.println("do you want to divide again:");
		System.out.println("1-yes  0-no");
		
	}
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}

}
else if(userchoice==5) {
	
	modulo();
	System.out.println("do you want to modulo again:");
	System.out.println("1-yes  0-no");
	int yesOrNo=sc.nextInt();
	if(yesOrNo==1) {
		modulo();
		System.out.println("do you want to modulo again:");
		System.out.println("1-yes  0-no");
		
	}
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==6) {
	
	swap();
	System.out.println("do you want to swap again:");
	System.out.println("1-yes  0-no");
	int yesOrNo=sc.nextInt();
	if(yesOrNo==1) {
		swap();
		System.out.println("do you want to swap again:");
		System.out.println("1-yes  0-no");
		
	}
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==7) {
	
	 evenOrOdd();
	System.out.println("do you want to check again:");
	System.out.println("1-yes  0-no");
	int yesOrNo=sc.nextInt();
	if(yesOrNo==1) {
		 evenOrOdd();
		System.out.println("do you want to check again:");
		System.out.println("1-yes  0-no");
		
	}
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
	else if(userchoice==8) {
		
		prime();
		System.out.println("do you want to check prime again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			prime();
			System.out.println("do you want to check prime again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==9) {
		
	greaterNumber();
		System.out.println("do you want to check again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			greaterNumber();
			System.out.println("do you want to check again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
	
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==10) {
	
	factorial();
		System.out.println("do you want to  know factorial again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			factorial();
			System.out.println("do you want to  know factorial again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}

else if(userchoice==11) {
	
	fibinocci();
		System.out.println("do you want to  know fibinocci series  again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			fibinocci();
			System.out.println("do you want to  know fibinocci series again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==12) {
	
	sumOfDigits();
		System.out.println("do you want to  know sum again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			sumOfDigits();
			System.out.println("do you want to  know sum again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}
else if(userchoice==13) {
	
	reverseNum();
		System.out.println("do you want to  know reverse again:");
		System.out.println("1-yes  0-no");
		int yesOrNo=sc.nextInt();
		if(yesOrNo==1) {
			reverseNum();
			System.out.println("do you want to  know reverse again:");
			System.out.println("1-yes  0-no");
			
		}
	
	else {
		
		menu();
		 userchoice=sc.nextInt();
	}
}

	else if(userchoice==0) {
		choice=false;
		System.out.println("see you again");
		System.out.println("thank you");
		
	}
	else {
		choice=false;
		System.out.println("give valid number");
		menu();
		userchoice=sc.nextInt();
		choice=true;
	}
	}
	}

}
	

	



