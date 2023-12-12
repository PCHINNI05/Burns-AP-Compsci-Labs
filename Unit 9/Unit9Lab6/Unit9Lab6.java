package Lab6;
import java.util.Scanner;
public class Unit9Lab6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name for your quiz");
		String name = sc.nextLine();
		
		Quiz quiz = new Quiz(name);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the question");
			String question = sc.nextLine();
			
			System.out.println("Is the question true or false (tf) or multiple choice (mc)?");
			String type = sc.nextLine();
			
			if (type.equalsIgnoreCase("tf")) {
				System.out.println("Is the answer true or false?");
				String tf = sc.nextLine();
				boolean tfAnswer;
				if (tf.equalsIgnoreCase("false")) {
					tfAnswer = false;
				}
				else {
					tfAnswer = true;
				}
				
				quiz.addQuestion(question, tfAnswer);
			}
			else if (type.equalsIgnoreCase("mc")) {
				System.out.println("Enter option 1");
				String opt1 = sc.nextLine();
				
				System.out.println("Enter option 2");
				String opt2 = sc.nextLine();
				
				System.out.println("Enter option 3");
				String opt3 = sc.nextLine();
				
				System.out.println("Enter option 4");
				String opt4 = sc.nextLine();
				
				System.out.println("Enter which (A, B, C, or D) corresponds with the answer");
				String mcAnswer = sc.nextLine();
				
				quiz.addQuestion(question, opt1, opt2, opt3, opt4, mcAnswer);
			}
			else {
				System.out.println("Enter a valid choice\n");
				i--;
				continue;
			}
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		for (int x = 0; x < 3; x++) {
			if (x == 0) {
				System.out.println(name);
			}
			System.out.println(quiz.nextQuestion());
			
			System.out.println("What is your answer?");
			String response = sc.nextLine();
			
			if (response.equalsIgnoreCase("true") || response.equalsIgnoreCase("false")) {
				if (response.equalsIgnoreCase("true")) {
					System.out.println(quiz.answerQuestion(true));
				}
				else if (response.equalsIgnoreCase("false")) {
					System.out.println(quiz.answerQuestion(false));
				}
			}
			else {
				System.out.println(quiz.answerQuestion(response));
			}
				
			System.out.println("\n");
			}
		System.out.println(quiz.done());
	}
}