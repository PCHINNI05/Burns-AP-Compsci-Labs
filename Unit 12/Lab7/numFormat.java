package Lab7;
public class numFormat {
	public static String commaAdd(long num) {
		if (num < 1000) {
			return String.valueOf(num);
		}
		else {
			String numString = "";
			
			numString += commaAdd(num / 1000);
			numString += ",";
	        if (num % 1000 < 100) {
	        	numString += "0";
	        }
	        if (num % 1000 < 10) {
	        	numString += "0";
	        }
	        numString += num % 1000;
	        
	        return numString;
		}
	}
}
