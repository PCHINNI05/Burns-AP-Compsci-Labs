public class Coin {
		private final int HEADS = 0;
		private final int TAILS = 1;
		
		private int face;
		
		public Coin()  {
		    flip();
		    
		}
		
		public String flip() {
		    face = (int)(Math.random()*2);
		    
		    String result;
		    
		    if (face == 1)
		    result = "HEADS";
		    
		    else 
		    result = "TAILS";
		    
		    return result;
		    
		}
		
		public String toString() {
		    String facename;
		    if (face == HEADS)
		        facename = "Heads";
		    else
		        facename = "Tails";
		    return facename;
		    
		}
}

