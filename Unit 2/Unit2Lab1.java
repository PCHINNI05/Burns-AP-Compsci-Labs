/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);
    Scanner s4 = new Scanner(System.in);
    
    System.out.println("Enter an integer");
    int a;
    a = s1.nextInt();
    
    System.out.println("Enter another integer");
    int b;
    b = s2.nextInt();

    System.out.println("Enter another integer");
    int c;
    c = s3.nextInt();

    System.out.println("Enter another integer");
    int d;
    d = s4.nextInt();
    
    int ABCD;
    ABCD = a + b + c + d;
    System.out.println("The average of your 4 integers is " + ABCD/4);
  }
}
