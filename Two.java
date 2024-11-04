/******************************************************************************
2. Create an empty overloaded constructor for the Exam class with two (2) String parameters named period and level.
*******************************************************************************/
class Exam {
    
    public String message;
    public String period;
    public String level;
    
    public Exam() {
        message = "Good Luck";
    }
    public Exam(String period, String level){
        period = period;
        level = level;
    }
}
public class Two
{
	public static void main(String[] args) {
	    Exam e = new Exam();
	    
	    System.out.println(e.message);
	}
}