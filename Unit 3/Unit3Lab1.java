import java.util.*;
public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        
        System.out.println("Enter the fan's age");
        int age = S1.nextInt();
        double price = 30.00;
        if (age >= 65) {
            
            price = price*0.50;
        }
        else {
          
          price = price;  
        }
        System.out.println("The ticket price for this fan is " + price);
    }
}

