import java.util.*;
public class Main {
	public static void main(String[] args) {
	    ArrayList<Integer> quizlist = new ArrayList<Integer>();
	    
	    Scanner S1 = new Scanner(System.in);
	    Scanner S2 = new Scanner(System.in);
	    Scanner S3 = new Scanner(System.in);

	    int num = 1;
	    int temp = 0;
	    int num2 = 0;
	    String suffix = "";
	    String letter = "";
	    
	    System.out.println("What is the student's name?");
	    String name = S1.nextLine();
	    
	    System.out.println("How many quizzes did " + name + " take?");
	    int quizCount = S2.nextInt();
	    
	    for (int x = quizCount; x > 0; x--) {
	        if (num % 10 == 1)
	        suffix = "st";
	        
	        else if (num % 10 == 2) 
	        suffix = "nd";
	        
	        else if (num % 10 == 3)
	        suffix = "rd";
	        
	        else 
	        suffix = "th";
	        
	        System.out.println("What was " + name + "'s score on the " + num + suffix + " quiz?");
	        int quizScore = S3.nextInt();
	        
	        quizlist.add(quizScore);
	        num++;
	        
	    }
	    
	    for (int i = 0; i < quizlist.size(); i++) {
	        temp = quizlist.get(i);
	        num2 += temp;
	    }
	    
	    int average = num2 /= quizlist.size();
	    
	    if (average >= 97)
	    letter = "A+";
	    
	    else if (average >= 94)
	    letter = "A";
	    
	    else if (average >= 90)
	    letter = "A-";
	    
	    else if (average >= 87)
	    letter = "B+";
	    
	    else if (average >= 84)
	    letter = "B";
	    
	    else if (average >= 80)
	    letter = "B-";
	    
	    else if (average >= 77)
	    letter = "C+";
	    
	    else if (average >= 74)
	    letter = "C";
	    
	    else if (average >= 70)
	    letter = "C-";
	    
	    else if (average >= 67)
	    letter = "D+";
	    
	    else if (average >= 64)
	    letter = "D";
	    
	    else if (average >= 60)
	    letter = "D-";
	    
	    else if (average < 60)
	    letter = "F";
	    
	    Student s1 = new Student(name, quizCount, average, letter);
		
		System.out.println(s1);
	}
}
