/******************************************************************************
6. Create three (3) class declarations to show multiple levels of inheritance. Use the classes named Exam, Midterm, and Essay.

*******************************************************************************/
public class Six {
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

class Midterm extends Exam {
}

class Essay extends Midterm {
}
