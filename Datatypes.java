package javaproject;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
