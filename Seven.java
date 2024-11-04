/******************************************************************************
7. Create a constructor named Midterm that prints "Exam has started." using println(). Its first statement should be a call to a constructor in the parent class.

*******************************************************************************/
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

class Midterm extends Exam {
    public Midterm() {
        super(); 
        System.out.println("Exam has started."); 
    }
}

class Essay extends Midterm {

}

public class Seven {
    public static void main(String[] args) {
        Midterm m = new Midterm();
        System.out.println(m.message); 
    }
}
