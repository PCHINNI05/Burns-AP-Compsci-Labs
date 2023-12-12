package Lab6;
import java.security.SecureRandom;
public class blurbTalk {
	private static SecureRandom gen = new SecureRandom();
	
	private static String createWhoozit(String whoozitBase) {
		int num = gen.nextInt(2);
		
		if (num == 1) {
			return whoozitBase;
		}
		else {
			num = gen.nextInt(2);
			return createWhoozit(whoozitBase + "y");
		}
	}
	private static String createWhatzit(String whatzitBase) {
		int num = gen.nextInt(2);
		String whatzit = whatzitBase;
		if (num == 1) {
			whatzit += "z";
		}
		else {
			whatzit += "d";
		}
		whatzit += createWhoozit("x");
		
		return whatzit;
	}
	public static String createBlurb() {
		String Blurb = "";
		Blurb += createWhoozit("x") + " ";
		Blurb += createWhatzit("q") + " ";
		
		int num = gen.nextInt(2);
		while (num == 0); {
			num = gen.nextInt(2);
			Blurb += createWhatzit("q") + " ";
		} 
		
		return Blurb;
	}
}
