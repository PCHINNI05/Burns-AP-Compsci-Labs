import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner S1 = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Farenheit you would like to convert into Celsius");
        Float temp;
        temp = S1.nextFloat();
        
        Float step2;
        step2 = (temp - 32);
        
        Float celsiustemp = (step2 * 5/9);
        
        System.out.println(temp + " in celsius is " + celsiustemp);
        
    }
}