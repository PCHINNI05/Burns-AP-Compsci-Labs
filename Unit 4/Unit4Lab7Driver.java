import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner S1 = new Scanner (System.in);
		Scanner S2 = new Scanner (System.in);
		
		System.out.println("There is a roach infestation in your Kitchen!\nLuckily you can still stop them if you work fast.\n\nFirst, how many roaches are there?");
		int StartPop = S1.nextInt();
		
		String ask = "";
		int RoachCount = StartPop;
		
		Roach myRoach = new Roach(StartPop);
		
		System.out.println("\nOk, you have 2 options: You can either spray them with Bug Spray, which kills 10% of the roaches, and stops a reproduction cycle, or bide your time and let them double in populaition? Type 'exit' to give up.");
		while (!ask.equalsIgnoreCase("exit") || RoachCount != 0) {
		    if (RoachCount==0) {
		    System.out.println("\nCongratulations, you bested the roaches and now your kitchen is roach free!");
		    System.exit(0);
		    
		    }
		    
		    System.out.println("\nDo you want to Spray or Wait?");
		    ask = S2.nextLine();
		    
		    if (ask.equalsIgnoreCase("Spray")) {
		        myRoach.Spray();
		        RoachCount *= 0.9;
		        
		    }
		    
		    else if (ask.equalsIgnoreCase("exit")) {
		        System.exit(0);
		        
		    }
		    
		    else {
		        myRoach.waitForDoubling();
		        RoachCount *= 2;
		        
		    }

		    
		    System.out.println(myRoach);
		}
		
	}
}
