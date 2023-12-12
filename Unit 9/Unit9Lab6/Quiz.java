package Lab6;
public class Quiz {
	Question[] quiz = new Question [10];
	private static int questionCount = 0;
	private int Score = 0;
	private static int currentIndex = 0;
	
	public Quiz (String name) {
		
	}
	public String addQuestion (String question, String opt1, String opt2, String opt3, String opt4, String answer) {
		String response = "";
		quiz[questionCount] = new Question(question, opt1, opt2, opt3, opt4, answer);
		questionCount++;
		
		response += "Q" + questionCount + " has been created\n\n";
		return response;
	}
	public String addQuestion (String question, boolean tf) {
		String response = "";
		quiz[questionCount] = new Question(question, tf);
		questionCount++;
		
		response += "Q" + questionCount + " has been created\n\n";
		return response;
	}
	
	public String answerQuestion (String answer) {
		String response = "";
		response += quiz[currentIndex].answerQ(answer);
		if (response.equalsIgnoreCase("Correct!\n\n")) {
			Score++;
		}
		currentIndex++;
		return response;
	}
	public String answerQuestion (boolean answer) {
		String response = "";
		response += quiz[currentIndex].answerQ(answer);
		if (response.equalsIgnoreCase("Correct!\n\n")) {
			Score++;
		}
		currentIndex++;
		return response;
	}
	public String nextQuestion () {
		return quiz[currentIndex].toString();
	}
	public String done() {
		String response = "You completed the quiz! Your final score was " + Score + "/3\n";
		
		return response;
	}
}