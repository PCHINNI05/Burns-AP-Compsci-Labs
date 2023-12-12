import java.util.*;
public class Main {
    public static void main (String[] args) {
        
        Scanner sideask = new Scanner(System.in);
        Scanner rollask = new Scanner(System.in);
        Scanner numfolask = new Scanner(System.in);
        
        int track = 0;
        
        System.out.println("How many sides do you want on your dice?\n4 is the minimum, if you enter a smaller value, it will default to 4");
        int sidenum = sideask.nextInt();
        
        System.out.println("How many times do you want to roll the die?");
        long rollnum = rollask.nextLong();
        
        System.out.println("What number do you want to keep track of? (One will never be picked, as 2 dice are being rolled))");
        int numfol = numfolask.nextInt();
        
        Die myDie = new Die(sidenum);
        Die myDie2 = new Die(sidenum);
        
        System.out.println("");
        
        System.out.println("Die 1\tDie 2\tTotal");
        
        for (long x = rollnum; x > 0; x--) {
            int facevalue1 = myDie.roll();
            int facevalue2 = myDie2.roll();
            int facevaluefinal = facevalue1 + facevalue2;
            System.out.println("  " + facevalue1 + "\t  " + facevalue2 + "\t  " + facevaluefinal);
            if (facevaluefinal == numfol) {
                track++;
                
            }
        
        
        }
        
        double a = ((double)track/rollnum)*100;
        
        System.out.println("\nYour number was rolled " + track + " time(s)");
        System.out.println("That is ~" + (int)a + "% of the total rolls");

    }
    
}