import java.util.*;
public class Main {
    
	public static void main(String[] args) {
	    
		Scanner S1 = new Scanner(System.in);
		Scanner S2 = new Scanner(System.in);
		Scanner S3 = new Scanner(System.in);
		Random R1 = new Random();
		
		String yn = "yes";
		String yn2 = "yes";
		
		int tiecount = 0;
		int losscount = 0;
		int wincount = 0;
		        
		System.out.println("Welcome to Rock Paper Scissors Lizard Spock!\n\nWould You like to play a game with one of our proffesional RPSLS computers?");
		yn = S1.nextLine();
		
    		if (yn.equalsIgnoreCase("yes")) {
    		    
    		    while (yn.equalsIgnoreCase("yes")) {
    		        
    		        int comnum = R1.nextInt(4) + 1;
    		        
    		        int rock = 1;
    		        int paper = 2;
    		        int scissors = 3;
    		        int lizard = 4;
    		        int spock = 5;
    		        String P1move = "Base";
    		        
    		        System.out.println("\nPick your move: rock, paper, scissors, lizard, or spock!");
    		        P1move = S2.nextLine();
    		        
    		        if (P1move.equalsIgnoreCase("rock")) {
    		            if (comnum == 1) {
    		                System.out.println("Its a tie\nYour opponent picked rock\n\n");
    		                
    		                tiecount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		           
    		                if (wincount != 10 && losscount != 10) {
    		                
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
    		                    }
    		                }
    		            }
    		            
    		            else if (comnum == 2) {
    		                System.out.println("Your opponent smothered your rock with their paper\nYour opponent picked paper\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 3) {
    		                System.out.println("You crushed your opponent's scissors with your rock\nYour opponent picked scissors\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 4) {
    		                System.out.println("You crushed your opponent's lizard with your rock\nYour opponent picked lizard\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 5) {
    		                System.out.println("Your rock was vaporized by Spock\nYour opponent picked spock\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		        }
    		        
    		        else if (P1move.equalsIgnoreCase("paper")) {
    		            if (comnum == 1) {
    		                System.out.println("You smothered your opponent's rock with your paper\nYour opponent picked rock\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 2) {
    		                System.out.println("It's a tie\nYour opponent picked paper\n\n");
    		                
    		                tiecount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 3) {
    		                System.out.println("Your paper was sliced to bits by your opponent's scissors\nYour opponent picked scissors\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 4) {
    		                System.out.println("Your paper was eaten alive by your opponent's lizard\nYour opponent picked lizard\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 5) {
    		                System.out.println("You disproved Spock with your paper\nYour opponent picked Spockock\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		        }
    		        
    		        else if (P1move.equalsIgnoreCase("scissors")) {
    		            if (comnum == 1) {
    		                System.out.println("Your scissors were crushed by your opponent's rock\nYour opponent picked rock\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 2) {
    		                System.out.println("You sliced your opponent's paper to bits\nYour opponent picked paper\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 3) {
    		                System.out.println("It's a tie\nYour opponent picked scissors\n\n");
    		                
    		                tiecount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 4) {
    		                System.out.println("You decapitated your opponent's lizard\nYour opponent picked lizard\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 5) {
    		                System.out.println("Your scissors were smashed by Spock\nYour opponent picked Spock\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		        }
    		        
    		        else if (P1move.equalsIgnoreCase("lizard")) {
    		            if (comnum == 1) {
    		                System.out.println("Your lizard was crushed by your opponent's rock\nYour opponent picked rock\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 2) {
    		                System.out.println("Your lizard ate your opponent's paper\nYour opponent picked paper\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 3) {
    		                System.out.println("Your lizard was decapitated by your opponent's scissors\nYour opponent picked scissors\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 4) {
    		                System.out.println("It's a tie\nYour opponent picked lizard\n\n");
    		                
    		                tiecount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 5) {
    		                System.out.println("Your lizard poisoned Spock\nYour opponent picked Spock\n\n");
    		                
    		                wincount++; 
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		        }
    		        
    		        else if (P1move.equalsIgnoreCase("spock")) {
    		            if (comnum == 1) {
    		                System.out.println("You vaporized your opponent's rock\nYour opponent picked rock\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 2) {
    		                System.out.println("You were disproved by your opponent's paper\nYour opponent picked paper\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 3) {
    		                System.out.println("You smashed your opponent's scissors\nYour opponent picked scissors\n\n");
    		                
    		                wincount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 4) {
    		                System.out.println("You were poisoned by your opponent's lizard\nYour opponent picked lizard\n\n");
    		                
    		                losscount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		            else if (comnum == 5) {
    		                System.out.println("It's a tie\nYour opponent picked Spock\n\n");
    		                
    		                tiecount++;
    		                
    		                System.out.println("You have " + wincount + " wins");
    		                System.out.println("You have " + losscount + " losses");
    		                System.out.println("You have " + tiecount + " ties");
    		            		                 
    		                if (wincount != 10 && losscount != 10) {
        		                 
        		                System.out.println("Would you like to play again?");
        		                yn = S1.nextLine();
        		                
        		                if (yn.equalsIgnoreCase("no")) {
        		                    System.exit(0);
        		                    
        		                }
    		                }
    		            }
    		            
    		        }
    		       if (wincount == 10) {
    		           System.out.println("Congratulations! You reached 10 wins and won this round!! Your final scores were: \n");
    		           System.out.println(wincount + " wins");
    		           System.out.println(losscount + " losses");
    		           System.out.println(tiecount + " ties");
    		           
    		           System.out.println("Would you like to start a new game?");
    		           yn2 = S3.nextLine();
    		           
    		           if (yn2.equalsIgnoreCase("yes")) {
    		               yn = "no";
    		               
    		           }
    		       }
    		       
    		       else if (losscount == 10) {
    		           System.out.println("You lost, but you can always play again. Your final scores were: \n");
    		           System.out.println(wincount + " wins");
    		           System.out.println(losscount + " losses");
    		           System.out.println(tiecount + " ties");
    		           
    		           }
    		    }
		    
		}
		
		
    		
    	else {
    	    System.out.println("\n\nOk then");
    		    
    	    System.exit(0);
    		    
    	}
	}
}
