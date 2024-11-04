/******************************************************************************
4. Declare a boolean-type accessor named isFinished that returns the value of status.

*******************************************************************************/
public class Four {
    public static void main(String[] args) {
        Exam e = new Exam(); 
        
        System.out.println(e.message); 
    }
}

class Exam {
    public String message;
    public String period;
    public String level;
    private double price;
    private boolean status;

    public Exam() {
        message = "Good Luck";
    }

    public Exam(String period, String level) {
        this.period = period; 
        this.level = level;   
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }

    public void setPrice(double Pri) {
        price = Pri;
    }
}
