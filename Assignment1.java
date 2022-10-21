public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Datatypes
		
		char a='l';
		char ch = 65;
		char ch1 = 6535;
		byte b1=127;
		//byte b2=128;
		int i1= 2147483647;
		// int i2= 2147483648; // this beyond the int limit
		short s1 = 32767;
		//short s2 = 32768; // this beyond the short limit
		long l1 = 922337036854775807l;
		//long l2 = 922337036854775808l; // beyond the long limit
		float f1 = 3.40282346688528860e+38f;
		//float f2 = 3.40282346688528860e+39f; // beyond the float limit
		System.out.println("-----Datatypes-----");
		System.out.println("Character "+a);
		System.out.println("Character "+ch);
		System.out.println("Character "+ch1);
		System.out.println("boolean "+b1);
		System.out.println("integer "+i1);
		System.out.println("Short "+s1);
		System.out.println("Long "+l1);
		System.out.println("Float "+f1);
		
		
		//operators
		
		//Arithmetic operators
		
		System.out.println("----------Arethmetic operators----------");
		int add, sub, div, mul, mod;
		
		int num1 = 10 ,num2 = 20;
		
		add= num1+num2;
		sub= num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod= num1%num2;
		
		
		System.out.println("Addition = "+add);
		System.out.println("Subtraction = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Division = "+div);
		System.out.println("Modulo = "+mod);
		
		
		//Logical operators
		
		System.out.println("----------Logical Operators----------");
		
		int value = 6;
		if(value >=10 && value %2==0 ){
			System.out.println("value is > 10 and its even");
		}
		else {
			System.out.println("doesn't satisfy");
		}
		
		//Unary operators
		
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
