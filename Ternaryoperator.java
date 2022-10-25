package javaproject;
import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		String ability = (a>18)?"Qulified for DL":"Age not Satisfied";
		System.out.println("he/she is "+a+" "+ability);

	}

}
