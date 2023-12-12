public class Employee {
    private String Name1, Name2;
    private int Income;
    
    public Employee (String FName, String LName, int Salary) {
        Name1 = FName;
        Name2 = LName;
        Income = Salary;
        
    }
    
    public String toString() {
        String result;
        
        result = Name2 + ", ";
        result += Name1 + " -  $" + Income;
        
        return result;
        
    }
    
}