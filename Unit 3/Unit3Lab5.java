import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner (System.in);
        
        System.out.println("Enter any integer");
        int num = S1.nextInt();
        
        String numString;
        numString = String.valueOf(num);
        
        int zero = 0;
        int odd = 0;
        int even = 0;
        
        for (int val = 0; val < numString.length(); val++) {
        char c = numString.charAt(val);
        
        if (c == '0') {
            zero++;
        }
        else if (c == '2' || c == '4' || c == '6' || c == '8') {
            even++;
        }
        else if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
            odd++;
        }
        else {
            System.out.println("INVLID CHARACTER: \"" + c + "\"");
        }
        }
        
        System.out.println("There are:\n" + odd + " odd number(s)\n" + even + " even number(s)\nand " + zero + " zero(s)");
       
        
    }
        
}
