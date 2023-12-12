import java.util.*;
public class Main {
    public static void main (String[]args) {

    Scanner S1 = new Scanner (System.in);

    System.out.println ("Enter a String of Words");
    String phrase = S1.nextLine ();
    
    int consonants=0;
    int lvowels=0;
    int uvowels=0;
    int spaces=0;
    
        for (int i = 0; i < phrase.length(); i++) {
        	if (phrase.charAt(i) == ('a') || phrase.charAt(i) == ('e') || phrase.charAt(i)== ('i') || phrase.charAt(i) == ('o') || phrase.charAt(i) == ('u') ) {
        	    lvowels++;
        
        	  }
        	else if (phrase.charAt(i) == (' ')) {
        	    spaces++;
        	    
        	}
        	else if (phrase.charAt(i) == ('A') || phrase.charAt(i) == ('E') || phrase.charAt(i) == ('I') || phrase.charAt(i) == ('O') || phrase.charAt(i) == ('U') ) {
        	    uvowels++;
        	    
        	}
        	else {
        	    consonants++;
        	    
        	}

        }
        
        System.out.println("There are " + lvowels + " lowercase vowels");
        System.out.println("There are " + uvowels + " uppercase vowels");
        System.out.println("There are " + consonants + " non-vowel characters, and");
        System.out.println("There are " + spaces + " spaces");
        
    }
        
}


