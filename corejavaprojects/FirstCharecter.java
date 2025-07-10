package corejavaprojects;

public class FirstCharecter {

	public static void main(String[] args) {
	 String str="Maheswari";
	 String str2="";
	 String str3="";
	 for(int i=0;i<=str.length();i++) {
		 for(int j=i+1;j<str.length();j++) {
			 
			 if( i != j && str.charAt(i)==str.charAt(j)) {
				 str2+=str.charAt(i);
				  break;
				 
			 }
			 
			 else {
				 str3+=str.charAt(i);
				
			 }
			                                                                                                                                                                                                                                              
		 }
		 }
	 System.out.println(str2);
System.out.println(str3);
	 }

	}


