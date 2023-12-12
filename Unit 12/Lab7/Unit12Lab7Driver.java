package Lab7;
import java.util.Scanner;
public class Unit12Lab7Driver {
	public static void main(String[] args) {
		numFormat format = new numFormat();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		long num = sc.nextLong();
		
		System.out.println(format.commaAdd(num));
	}
}
