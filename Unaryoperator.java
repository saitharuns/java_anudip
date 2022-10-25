package javaproject;

public class Unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("----------Unary Operators-------------");
		
		int res;
		char a1 ='A';
		res=a1; // unary positive;
		System.out.println("Unary positive = "+res);
		res=-a1;
		System.out.println("Unary Negative = "+res);
		
		// pre increment
		System.out.println("----------pre increment -------------");
		int first =10, second;
		second = ++first; // preincrement is done here
		System.out.println("first "+first+" Second "+second);
		
		// post increment
		System.out.println("----------post increment -------------");
		
		int toni =10, vijay;
		vijay = toni++; // postincrement is done here
		System.out.println("first "+toni+" Second "+vijay);
		
		
		// pre decrement
		System.out.println("----------pre decrement -------------");
		int first1 =10, second1;
		second1 = --first1; // predecrement is done here
		System.out.println("first "+first1+" Second "+second1);
		
		// post increment
		System.out.println("----------post Decrement -------------");
				
		int toni1 =10, vijay1;
		vijay1 = toni1--; // postdecrement is done here
		System.out.println("first "+toni1+" Second "+vijay1);
		
		//unary logical not
		System.out.println("----------logical not -------------");
		
		boolean s=true;
		System.out.println(!s);

	}

}
