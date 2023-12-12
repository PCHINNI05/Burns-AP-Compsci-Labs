import java.util.*; 
public class Main{
	public static void main(String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        
        System.out.println("Enter a size for one side of the table");
        int x = S1.nextInt();
        
        int a;
        int b;
        for (a=1; a<=x; a++){
            for (b=1; b<=x; b++){
                System.out.print(a*b+"   ");  
            }
            System.out.println();
            }
        }
}

