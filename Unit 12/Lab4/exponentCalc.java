package Lab4;
public class exponentCalc {
	public static long powerOf (long base, long power) {
		if (power == 1) {
			return base;
		}
		else {
			return base * powerOf(base, power - 1);
		}
	}
}
