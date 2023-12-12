package Lab3;
public class numCount {
	public static int count(long num) {
		if (num < 10) {
			return 1;
		}
		else {
			return 1 + count(num / 10);
		}
	}
}
