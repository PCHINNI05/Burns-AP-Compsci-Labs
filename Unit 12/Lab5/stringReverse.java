package Lab5;
public class stringReverse {
	public static String flip(String start) {
		if (start.length() == 1 || start == null) {
			return start;
		}
		else {
			return flip(start.substring(1)) + start.charAt(0);
		}
	}
}
