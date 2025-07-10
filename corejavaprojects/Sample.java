package corejavaprojects;

public class Sample {
   static int x=40;

	public static void main(String[] args) {
	 int x=50;
	Sample s=new Sample();
	System.out.println(s.x);
	System.out.println(x);
	s.sub();
	
	}

	void sub(){
		System.out.println(x);
	}
}