import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner S1 = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        Scanner S3 = new Scanner(System.in);
        Scanner S4 = new Scanner(System.in);
        Scanner S5 = new Scanner(System.in);
        Scanner S6 = new Scanner(System.in);
        
        System.out.println("Two new Employees joined and they need to be added to the database \nEnter their First name, Last Name, and Salary when prompted\n");
        System.out.println("Enter the first Employee's first name");
        String emp1N1 = S1.nextLine();
        
        System.out.println("Enter the first Employee's last name");
        String emp1N2 = S2.nextLine();
        
        System.out.println("Enter the first Employee's yearly salary");
        int emp1Salary = S3.nextInt();
        
        System.out.println("");
        
        System.out.println("Enter the second Employee's first name");
        String emp2N1 = S1.nextLine();
        
        System.out.println("Enter the second Employee's last name");
        String emp2N2 = S2.nextLine();
        
        System.out.println("Enter the second Employee's yearly salary");
        int emp2Salary = S3.nextInt();
        
        System.out.println("");
        
        Employee emp1 = new Employee(emp1N1, emp1N2, emp1Salary);
        Employee emp2 = new Employee(emp2N1, emp2N2, emp2Salary);
        
        System.out.println(emp1);
        System.out.println(emp2);
        
    }
}