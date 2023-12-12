package Lab6;
public class Question {
	private boolean tfAnswer;
	private String mcAnswer = "";
	private String question;
	private int typeCheck;
	
	private String opt1, opt2, opt3, opt4;
	public Question (String question, boolean tf) {
		typeCheck = 1;
		tfAnswer = tf;
		this.question = question;
	}
	public Question (String question, String opt1, String opt2, String opt3, String opt4, String answer) {
		typeCheck = 2;
		
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.question = question;
		mcAnswer = answer;
	}
	
	public String answerQ (String answer) {
		String response = "";
		if (answer.equalsIgnoreCase(mcAnswer)) {
			response = "Correct!";
		}
		else {
			response = "Incorrect, the correct answer was " + mcAnswer;
		}
		return response;
	}
	public String answerQ (boolean answer) {
		String response = "";
		if (answer == tfAnswer) {
			response = "Correct!";
		}
		else {
			response = "Incorrect, the correct answer was " + Boolean.toString(tfAnswer);
		}
		return response;
	}
	public String getAnswer () {
		String response = "";
		if (mcAnswer.equalsIgnoreCase("")) {
			response = Boolean.toString(tfAnswer);
		}
		else {
			response = mcAnswer;
		}
		return response;
	}
	
	public String toString() {
		String response = question + "\n";
		if (typeCheck == 1) {
			response += "True or False?";
		}
		else {
			response += "A. " + opt1 + "\n";
			response += "B. " + opt2 + "\n";
			response += "C. " + opt3 + "\n";
			response += "D. " + opt4 + "\n";
		}
		return response;
	}
}