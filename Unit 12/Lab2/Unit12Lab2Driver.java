package Lab2;
import java.util.Scanner;
public class Unit12Lab2Driver {
	public static void main(String[] args) {
		factorialCalc calc = new factorialCalc();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		long num = sc.nextLong();
		
		System.out.println(calc.factCalc(num));
	}
}
