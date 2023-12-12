package Lab5;
import java.util.Scanner;
public class Unit12Lab5Driver {
	public static void main(String[] args) {
		stringReverse strFlip = new stringReverse();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		System.out.println(strFlip.flip(str));
	}
}