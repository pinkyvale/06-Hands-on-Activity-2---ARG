/******************************************************************************
8. Given the base class named Quiz and the derived class named Essay, write a statement to show inheritance between these classes.

*******************************************************************************/
public class Eight
{
	public static void main(String[] args) {
		Exam e = new Exam();
	}
}
class Quiz{
    public Quiz(){
        System.out.println("Base Class");
    }
}
class Essay extends Quiz{
    public Essay(){
        System.out.println("Derived Class");
    }
}
class Exam extends Essay{
    public Exam(){
        System.out.println("Class");
    }
}