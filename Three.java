/******************************************************************************
3. Declare a double-type accessor named getPrice that returns the value of price.

*******************************************************************************/
class Exam {
    public String message;
    public String period;
    public String level;
    private double price;

    public void setPrice(double Pri) {
        price = Pri;
    }

    public double getPrice() {
        return price;
    }

    public Exam() {
        message = "Good Luck";
    }

    public Exam(String period, String level) {
        this.period = period; 
        this.level = level;  
    }
}

public class Three {
    public static void main(String[] args) {
        Exam one = new Exam();
        
        System.out.println(one.message);
    }
}
