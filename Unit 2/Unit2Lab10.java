import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        Scanner S3 = new Scanner(System.in);
        
        System.out.println("Enter the length of one side of a triangle");
        double a = S1.nextFloat();
        
        System.out.println("Enter the length of the second side of the same triangle");
        double b = S2.nextFloat();
        
        System.out.println("Enter the length of the final side");
        double c = S3.nextFloat();
        
        double s = (a + b + c)/2;
        
        double area = Math.sqrt (s * (s - a) * (s - b) * (s - c));
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        
        System.out.println("The area of your triangle according Heron's Formula is " + df.format(area) + " units^2");
    }
    
}
