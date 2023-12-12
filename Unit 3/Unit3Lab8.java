import java.util.*;
public class Main {
    public static void main (String[] args) {
        
        Random gen = new Random();
        Scanner S1 = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        Scanner S3 = new Scanner(System.in);
        
        int num = gen.nextInt(200) + 1;
        System.out.println("Are you ready to play Hi - Lo? The random number guessing game!!");
        String yn = S1.nextLine(); 
        
            if (yn.equalsIgnoreCase("yes")) {
            
            while (yn.equalsIgnoreCase("yes")) {
                
                System.out.println("Great! The rules are simple, I pick a numer between 1 and 200 and you have to guess it. You have 10 guesses.");
                
                for (int guessnum=0; guessnum<=10; guessnum++){
                    System.out.println("\nYou have " + (10-guessnum) + " guesses left to guess the number. Type your guess now");
                    int guess = S2.nextInt();
                    
                        if (guess < num) {
                            System.out.println("Too low");
                            
                            System.out.println("Do you want to keep playing?");
                            yn = S3.nextLine();
                            
                            if (yn.equalsIgnoreCase("yes")){
                                System.out.println("Great!");
                            }
                            
                            else {
                            System.out.println("Thanks for playing!");
                            System.exit(0);
			    }
                        }
                        
                        else if (guess > num) {
                            System.out.println("Too high");
                            
                            System.out.println("Do you want to keep playing?");
                            yn = S3.nextLine();
                            
                            if (yn.equalsIgnoreCase("yes")){
                                System.out.println("Great!");
                            }
                            else {
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                            }
                            
                        }
                        
                        else {
                            System.out.println("Congrats! You guessed the number! The number was " + num);
                            
                            System.out.println("Do you want to keep playing?");
                            yn = S3.nextLine();
                            
                            if (yn.equalsIgnoreCase("yes")) {
                                guessnum = 11 ;
                                
                            }
                            else {
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                            }

                        }
                }
            }
            }
            
            else {
            System.out.println("Well that's awkward... \n\nGoodbye then");
            }
    }
    
}




