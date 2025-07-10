package corejavaprojects;

public class SerchinginArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int target=6;
		int test=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				 test=arr[i]+arr[j];
				 if(test==target) {
					 System.out.println(i);
					 System.out.println(j);
					 
				 }
			}
		}

	}

}
