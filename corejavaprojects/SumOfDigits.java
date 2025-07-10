package corejavaprojects;

public class SumOfDigits {

	public static void main(String[] args) {
		int digit=171;
		int sum=0;
		
		//System.out.println(remainder);
	
		while(digit>0)
		{
			sum=sum+digit%10;
			digit=digit/10;

		
		}
		System.out.println(sum);
	}

}
