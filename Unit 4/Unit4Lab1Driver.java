public class Main {
	public static void main (String[] args) {
	    int heads = 0, tails = 0;
	    int flipcount1 = 0, flipcount2 = 0, flipcount3 = 0;
	    
	    Coin myCoin = new Coin();
	    
	    System.out.println("Goal 1: Heads to 3\n");
	    
	    while (heads < 3) {
	        myCoin.flip();
	        
	        if (myCoin.isHeads()) {
	            heads++;
	            System.out.println("heads");
	        }
	        else {
	            tails++;
	            System.out.println("tails");
	        }
	        
	        flipcount1++;
	    }
	    
    System.out.println("\nHeads: " + heads);
    System.out.println("Tails: " + tails);
    System.out.println("It took " + flipcount1 + " flips for heads to reach 3\n\n");
    
    heads = 0;
    tails = 0;
    
	    System.out.println("\nGoal 2: Heads to 7\n");
	    
	    while (heads < 7) {
	        myCoin.flip();
	        
	        if (myCoin.isHeads()) {
	            heads++;
	            System.out.println("heads");
	        }
	        else {
	            tails++;
	            System.out.println("tails");
	        }
	        
	        flipcount2++;
	    }
	    
    System.out.println("\nHeads: " + heads);
    System.out.println("Tails: " + tails);
    System.out.println("It took " + flipcount2 + " flips for heads to reach 7\n\n");
    
    heads = 0;
    tails = 0;
    
	    System.out.println("\nGoal 3: Tails to 1000\n");
	    
	    while (tails < 1000) {
	        myCoin.flip();
	        
	        if (myCoin.isHeads()) {
	            heads++;
	        }
	        else {
	            tails++;
	        }
	        
	        flipcount3++;
	    }
	    
    System.out.println("\nHeads: " + heads);
    System.out.println("Tails: " + tails);
    System.out.println("It took " + flipcount3 + " flips for tails to reach 1000\n\n");
}
}
