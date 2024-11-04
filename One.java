/******************************************************************************
1. Create a constructor named Exam that assigns "Good luck" to a previously declared String variable named message.
*******************************************************************************/
class Exam {
    public String message; 
    
    public Exam() {
        message = "Good Luck";
    }
}

class One {
    public static void main(String[] args) {
        Exam e = new Exam();
        
        System.out.println(e.message); 
    }
}
