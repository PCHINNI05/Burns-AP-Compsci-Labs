package Lab1;
public class numSum {
	public static long sum (long num) {
		if (num < 0) {
			throw new IllegalArgumentException("Number must be positive");
		}
		
		if (num > 9) {
		      return num % 10 + sum(num / 10);
		}
		else {
			return num;
		}
	}
}
