import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        Scanner S3 = new Scanner(System.in);
        Scanner S4 = new Scanner(System.in);
        Scanner S5 = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name;
        name = S1.nextLine();
        
        System.out.println("Enter your age");
        int age;
        age = S2.nextInt();
        
        System.out.println("Enter your favorite Sports Team");
        String SportsTeam;
        SportsTeam = S3.nextLine();
        
        System.out.println("Enter your pet's species");
        String pets;
        pets = S4.nextLine();
        
        System.out.println("Enter your pet's name");
        String petn;
        petn = S5.nextLine();
        
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old\n    I really love the " + SportsTeam + "\nI Love my " + pets + ", " + petn + " very much!");
    }
}