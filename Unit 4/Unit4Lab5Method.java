import java.util.*;
public class Student {
    
    public int quizScore = 0, quizzesTaken = 0, quizAverage = 0;
    String letterGrade = "";
    private String Name;
    Student(String name, int quizzes, int average, String letter) {
        Name = name;
        quizzesTaken = quizzes;
        quizAverage = average;
        letterGrade = letter;
    }
    
    public String toString() {
        String result;
        
        result = "\n" + Name;
        result += "\n" + quizzesTaken + " quizzes taken\n";
        result += "Average score: " + (int)quizAverage + "\n";
        result += Name + " has a " + letterGrade;
        
        return result;
    }
    
}