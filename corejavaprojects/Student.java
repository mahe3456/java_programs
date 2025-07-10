package corejavaprojects;
 class Candidate{
	 private int rollno;
	 private int marks;
	 public void setdetails(int rollno,int marks) {
		 this.rollno=rollno;
		 this.marks=marks;
		  
	 }
	 public void getdetails() {
		 System.out.println("roll no:"+rollno);
		 System.out.println("marks:"+marks);
	 }
	  protected String gradecal() {
		  if(marks>=90) {
			  return "A";
		  }
		  else if(marks>=75) {
			  return "B";
		  }
		  else if(marks>=50) {
			  return "C";
		  }
		  else {
			  return "fail";
		  }
	  }
 }

