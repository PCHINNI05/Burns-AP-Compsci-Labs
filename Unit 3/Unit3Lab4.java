import java.util.*;
public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        
        System.out.println("Enter any integer greater than 2");
        int Num = S1.nextInt();
       
       while (Num < 2) {
        
        System.out.println("That number isn't less than 2. Try again");
        
        System.out.println("\nEnter any integer greater than 2");
        Num = S1.nextInt();
        
       }
       
        int x = 2;
        int y = 0;
        while (x <= Num) {
            
            y = y + x;
            x = x + 2;
        }
        
        System.out.println("The sum of all even numbers between 2 and " + Num +  " is " + y);
        
    }
}

