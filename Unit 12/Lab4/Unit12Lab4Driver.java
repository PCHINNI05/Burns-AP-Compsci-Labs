package Lab4;
import java.util.Scanner;
public class Unit12Lab4Driver {
	public static void main(String[] args) {
		exponentCalc calc = new exponentCalc();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		long base = sc.nextInt();
		
		System.out.println("Enter another number");
		long power = sc.nextInt();
		
		System.out.println(calc.powerOf(base, power));
	}
}
