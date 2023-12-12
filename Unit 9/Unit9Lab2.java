package Lab2;
import java.util.Scanner;
public class Unit9Lab2 {
	public static void main(String[] args) {
		int[] valueArray = new int[51];
		
		Scanner S1 = new Scanner(System.in);
		
		for(int x = 0; x < valueArray.length; x++) {
			valueArray[x] = 0;
		}
		
		System.out.println("Enter an integar value from -30 - 20 inclusive");
		
		while (S1.hasNext()) {
			int num;
			num = S1.nextInt();
			if (num > 20 || num < -30) {
				throw new IllegalArgumentException("Value out of -30 - 20 inclusive range");
			}
			valueArray[num + 30]++;
			System.out.println("Enter another integar, or press <ctrl> z to stop (or <ctrl> d on GDB");
		}
		
		for (int e = 0; e < valueArray.length; e++) {
				String response = (e - 30) + ":";
				System.out.printf("%-10s%d%n", response, valueArray[e]);
		}
	}
}