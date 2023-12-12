package Lab3;
import java.security.SecureRandom;
public class Unit9Lab3 {
	public static void main(String[] args) {
		int[] numbers = new int[200];
		int[] values = new int[101];
		int counter = 0;
		
		SecureRandom gen = new SecureRandom();
		
		for (int x = 0; x < values.length; x++) {
			values[x] = 0;
		}
		for (int i = 0; i < numbers.length; i++) {
			int num = gen.nextInt(100);
			numbers[i] = num;
			values[num]++;
		}
		for (int a = 0; a < values.length; a += 10) {
			if (a == 100) {
				System.exit(0);
			}
			else {
				System.out.printf("%02d-%02d:", a + 1, a + 10);
			}
			    int starCount = 0;
			    String stars = "";
			    for (int num = 1; num <= 10; num++) {
			    	starCount += values[num + (counter*10)];
			    }
			    
			    counter++;
			    
			    for (int z = 0; z < starCount; z++) {
			        stars += "*";
			    }
			    System.out.print(stars);
			    System.out.println();
		}
	}
}
