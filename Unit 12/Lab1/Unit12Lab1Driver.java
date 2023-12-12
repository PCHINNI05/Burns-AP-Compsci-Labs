package Lab1;
import java.util.Scanner;
public class Unit12Lab1Driver {
	public static void main(String[] args) {
		numSum calc = new numSum();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		long num = sc.nextLong();
		
		System.out.println(calc.sum(num));
	}
}