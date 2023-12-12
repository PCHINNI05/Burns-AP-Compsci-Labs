import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = S1.nextInt();
        
        System.out.println("Are you from Union County (yes or no)");
        String county = S2.nextLine();
        
        double price = 40;
        
        if (county.equals("yes")) {
            
        if (age <= 5) {
            
            System.out.println("The ticket price for this fan is $" + 0);
            
        }
        
        if (age >= 65) {
            
            price = price * 0.5;
            System.out.println("The ticket price for this fan is $" + (int)price);
            
        }
        
        if ((age > 5) & (age < 65)) {
            
            price = 30;
            System.out.println("The ticket price for this fan is $" + (int)price);
            
        }
        
        }
        
        else {
            
        if (age <= 5) {
            
            System.out.println("The ticket price for this fan is $" + 0);
        }
        
        if (age >= 65) {
            
            price = price * 0.5;
            System.out.println("The ticket price for this fan is $" + (int)price);
        }
        
        if ((age > 5) & (age < 65)) {
            
            System.out.println("The ticket price for this fan is $" + (int)price);
        }
        
        }
    }
}
