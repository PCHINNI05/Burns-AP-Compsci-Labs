import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Enter a string of words");
		String input = S1.nextLine();
		
		for (int val = 0; val < input.length(); val++) {
            char c = input.charAt(val);
            
		    System.out.println(c);
		}
	}
}
