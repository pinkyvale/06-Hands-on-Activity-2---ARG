/******************************************************************************
5. Declare a class named Midterm that inherits from the class named Exam.

*******************************************************************************/
class Exam {
    public String message;
    public String period;
    public String level;
    private double price;
    private boolean status;

    public boolean isFinished() {
        return status;
    }

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

class Midterm extends Exam {
}

public class Five {
    public static void main(String[] args) {
        Exam five = new Exam();
        
        System.out.println(five.message);
    }
}

