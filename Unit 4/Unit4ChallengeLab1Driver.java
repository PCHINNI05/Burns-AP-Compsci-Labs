import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		Scanner S2 = new Scanner(System.in);
		
		String ask = "";
		int ppoints = 0, cpoints = 0, ptemp = 0, ctemp = 0, ptemp2 = 0, ctemp2 = 0, pscore = 0, pscore2 = 0, cscore = 0, cscore2 = 0, pfinal = 0, cfinal = 0, x = 0;
		
		PigPlayer pig = new PigPlayer();
		PigPlayer pig2 = new PigPlayer();
		PigPlayer cpig = new PigPlayer();
		PigPlayer cpig2 = new PigPlayer();
		Coin coin = new Coin();
		
		System.out.println("Pick whether you want to be heads or tails to decide who goes first");
		String coinask = S1.nextLine();
		
		String coincheck = coin.flip();
		
		System.out.println(coincheck);
		
		if (coincheck.equalsIgnoreCase(coinask)) {
		    System.out.println("You go first");
		while (!ask.equalsIgnoreCase("exit")) {
		    while (!ask.equals("keep") && pfinal < 100 && !ask.equals("endRound")) {
		        System.out.println("\nDo you want to keep your Score, check both scores, or Roll the Dice? (keep/check/roll)");
		        System.out.println("Type 'exit' to end the program");
		        System.out.println("You have " + pfinal + " points and your opponent has " + cfinal);
		        ask = S2.nextLine();
		        
		        if (ask.equalsIgnoreCase("roll")) {
		            ptemp = pig.rollDice();
		            ptemp2 = pig2.rollDice();
		            int ptempfinal = ptemp + ptemp2;
		            
		            System.out.println("Die 1\tDie 2\tTotal");
		            System.out.println("  " + ptemp + "\t  " + ptemp2 + "\t  " + ptempfinal + "\n");
		            
		            if (ptemp == 1 && ptemp2 == 1) {
		                System.out.println("You got Snake Eyes, meaning you lost all your points. Now you are back to 0");
		                ppoints = 0;
		                ptemp = 0;
		                ptemp2 = 0;
		                pfinal = 0;
		                pig.fullClear();
		                pig2.fullClear();
		                ask = "endRound";
		                
		            }
		            
		            else if (ptemp == 1 || ptemp2 == 1) {
		                System.out.println("You got one 1, meaning you lost all your points from this round");
		                ppoints = 0;
		                ptemp = 0;
		                ptemp2 = 0;
		                pig.clear();
		                pig2.clear();
		                ask = "endRound";
		                
		            }
		            
		            ppoints += ptemp;
		            ppoints += ptemp2;
		            
		            pfinal = ppoints;
		            
		        }
		        
		        else if (ask.equalsIgnoreCase("check")) {
		            pscore = pig.getScore();
		            pscore2 = pig2.getScore();
		            
		            ppoints = pscore + pscore2;
		            
		            System.out.println("You have " + (pscore + pscore2) + " points");
		            System.out.println("Your opponent has " + (cscore + cscore2));
		            
		        }
		        
		        else if (ask.equalsIgnoreCase("keep")) {
		            pscore = pig.getScore();
		            pscore2 = pig2.getScore();
		            
		            pig.keepScore(pscore);
		            pig2.keepScore(pscore2);
		            
		        }
		        
		        else if (ask.equalsIgnoreCase("exit"))
		            System.exit(0);
		        
		    }
		    
		    if (ppoints >= 100) {
		        System.out.println("You got " + ppoints + " points and won! Congrats");
		        System.exit(0);
		        
		    }
		    
		    System.out.println("Your turn is now over");
		    ask = "";
		    x = 0;
		    
		    while (x < 20 && cfinal < 100) {
		        ctemp = cpig.rollDice();
		        ctemp2 = cpig2.rollDice();
		        int ctempfinal = ctemp + ctemp2;
		        
		        System.out.println("\nDie 1\tDie 2\tTotal");
		        System.out.println("  " + ctemp + "\t  " + ctemp2 + "\t  " + ctempfinal + "\n");
		        
		        if (ctemp == 1 && ctemp2 == 1) {
		                System.out.println("Your opponent got Snake Eyes, meaning they lost all of their points. Now they are back to 0");
		                cpoints = 0;
		                ctemp = 0;
		                ctemp2 = 0;
		                cfinal = 0;
		                cpig.fullClear();
		                cpig2.fullClear();
		                x = 20;
		                
		            }
		            
		            else if (ctemp == 1 || ctemp2 == 1) {
		                System.out.println("Your opponent got one 1, meaning they lost all they're points from this round");
		                cpoints = 0;
		                ctemp = 0;
		                ctemp2 = 0;
		                cpig.clear();
		                cpig2.clear();
		                x = 20;
		                
		            }
		            
		        cpoints += ctemp;
		        cpoints += ctemp2;
		        
		        cfinal = cpoints;
		        
		        if (x < 20) {
		            x = cpoints;
		        
		        }
		        
		    }
		    
		    if (cpoints >= 100) {
		        System.out.println("Your opponent got " + cpoints + " points and won. Better luck next time.");
		        System.exit(0);
		        
		    }
		    
		    System.out.println("Your opponent's turn is over");
		    ask = "";
		    
		}
		
		}
		
		else {
		    System.out.println("You go second");
		    while (!ask.equalsIgnoreCase("exit")) {
		    	while (x < 20 && cfinal < 100) {
    		        ctemp = cpig.rollDice();
    		        ctemp2 = cpig2.rollDice();
    		        int ctempfinal = ctemp + ctemp2;
    		        
    		        System.out.println("\nDie 1\tDie 2\tTotal");
    		        System.out.println("  " + ctemp + "\t  " + ctemp2 + "\t  " + ctempfinal + "\n");
    		        
    		        if (ctemp == 1 && ctemp2 == 1) {
    		                System.out.println("Your opponent got Snake Eyes, meaning they lost all of their points. Now they are back to 0");
    		                cpoints = 0;
    		                ctemp = 0;
    		                ctemp2 = 0;
    		                cfinal = 0;
    		                cpig.fullClear();
    		                cpig2.fullClear();
    		                x = 20;
    		                ;
    		                
    		            }
    		            
    		            else if (ctemp == 1 || ctemp2 == 1) {
    		                System.out.println("Your opponent got one 1, meaning they lost all they're points from this round");
    		                cpoints = 0;
    		                ctemp = 0;
    		                ctemp2 = 0;
    		                cpig.clear();
    		                cpig2.clear();
    		                x = 20;
    		                
    		            }
    		            
    		        cpoints += ctemp;
    		        cpoints += ctemp2;
    		        
    		        cfinal = cpoints;
    		        
    		        if (x < 20) {
    		            x = cpoints;
    		        
    		        }
    		        
		        }
		        
		        System.out.println("Your opponent's turn is over");
		        
		        if (ppoints >= 100) {
		            System.out.println("You got " + ppoints + " points and won! Congrats");
		            System.exit(0);
		        
		        }
		        
		        ask = "";
		        x = 0;
		        
		        while (!ask.equals("keep") && pfinal < 100 && !ask.equals("endRound")) {
    		        System.out.println("\nDo you want to keep your Score, check both scores, or Roll the Dice? (keep/check/roll)");
    		        System.out.println("Type 'exit' to end the program");
    		        System.out.println("You have " + pfinal + " points and your opponent has " + cfinal);
    		        ask = S2.nextLine();
    		        
    		        if (ask.equalsIgnoreCase("roll")) {
    		            ptemp = pig.rollDice();
    		            ptemp2 = pig2.rollDice();
    		            int ptempfinal = ptemp + ptemp2;
    		            
    		            System.out.println("Die 1\tDie 2\tTotal");
    		            System.out.println("  " + ptemp + "\t  " + ptemp2 + "\t  " + ptempfinal + "\n");
    		            
    		            if (ptemp == 1 && ptemp2 == 1) {
    		                System.out.println("You got Snake Eyes, meaning you lost all your points. Now you are back to 0");
    		                ppoints = 0;
    		                ptemp = 0;
    		                ptemp2 = 0;
    		                pfinal = 0;
    		                pig.fullClear();
    		                pig2.fullClear();
    		                ask = "endRound";
    		                
    		            }
    		            
    		            else if (ptemp == 1 || ptemp2 == 1) {
    		                System.out.println("You got one 1, meaning you lost all your points from this round");
    		                ppoints = 0;
    		                ptemp = 0;
    		                ptemp2 = 0;
    		                pig.clear();
    		                pig2.clear();
    		                ask = "endRound";
    		                
    		            }
    		            
    		            ppoints += ptemp;
    		            ppoints += ptemp2;
    		            
    		            pfinal = ppoints;
    		            
    		        }
    		        
    		        else if (ask.equalsIgnoreCase("check")) {
    		            pscore = pig.getScore();
    		            pscore2 = pig2.getScore();
    		            
    		            ppoints = pscore + pscore2;
    		            
    		            System.out.println("You have " + (pscore + pscore2) + " points");
    		            System.out.println("Your opponent has " + (cscore + cscore2));
    		            
    		        }
    		        
    		        else if (ask.equalsIgnoreCase("keep")) {
    		            pscore = pig.getScore();
    		            pscore2 = pig2.getScore();
    		            
    		            pig.keepScore(pscore);
    		            pig2.keepScore(pscore2);
    		            
    		        }
    		        
    		        else if (ask.equalsIgnoreCase("exit"))
    		            System.exit(0);
    		        
    		    }
    		    
    		    System.out.println("Your turn is now over");
    		    ask = "";
    		    
    		    if (ppoints >= 100) {
		            System.out.println("You got " + ppoints + " points and won! Congrats");
		            System.exit(0);
		        
		        }

    		    
    		    
		    }
		
        }
    }
}