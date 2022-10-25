package javaproject;

public class Localvariable {

	int a=10, b= 20;
	void get() {
		int x = 6;// it is a local variable
		
		System.out.println(x);
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Localvariable l= new Localvariable();
		l.get();
		int c;
		c=1;// local variable should be defined
		System.out.println(l.a+" "+l.b+""+c);
	}

}
