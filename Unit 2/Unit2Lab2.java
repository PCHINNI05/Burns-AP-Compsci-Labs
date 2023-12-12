import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        
        System.out.println("Enter a floating point number (a number that can include decimals)");
        float a;
        a = s1.nextFloat();
        
        System.out.println("Enter another floating point number");
        float b;
        b = s2.nextFloat();
        
        System.out.println("Enter a third floating point number");
        float c;
        c = s3.nextFloat();
        
        
        float sum;
        sum = (a+b+c);
        
        float dif;
        dif = (a-b-c);
        
        float product;
        product = (a*b*c);
        
        System.out.println("The sum is " + sum);
        
        System.out.println("The difference is " + dif);
        
        System.out.println("The product is " + product);
        
    }

}
