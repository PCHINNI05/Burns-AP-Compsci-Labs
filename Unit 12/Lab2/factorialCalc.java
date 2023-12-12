package Lab2;
public class factorialCalc {
	public static long factCalc (long num) {
		if (num == 1) {
			return num;
		}
		else {
			return num * factCalc(num - 1);
		}
	}
}
