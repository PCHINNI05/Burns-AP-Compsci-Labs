package Lab1;
import java.util.Scanner;
public class Unit9Lab1 {
	public static void main(String[] args) {
		int[] valueArray = new int[51];
		
		Scanner S1 = new Scanner(System.in);
		
		for(int x = 0; x < valueArray.length; x++) {
			valueArray[x] = 0;
		}
		
		System.out.println("Enter an integar value from 0-50 inclusive");
		
		while (S1.hasNext()) {
			int num;
			num = S1.nextInt();
			if (num > 50 || num < 0) {
				throw new IllegalArgumentException("Value out of 0 - 50 inclusive range");
			}
			valueArray[num]++;
			System.out.println("Enter another integar, or press <ctrl> z to stop (or <ctrl> d on GDB");
		}
		
		for (int e = 0; e < valueArray.length; e++) {
				String response = e + ":";
				System.out.printf("%-10s%d%n", response, valueArray[e]);
		}
	}
}