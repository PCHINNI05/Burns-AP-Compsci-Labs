package Lab3;
import java.util.Scanner;
public class Unit12Lab3Driver {
	public static void main (String[] args) {
		numCount calc = new numCount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		long num = sc.nextLong();
		
		System.out.println(calc.count(num));
	}
}