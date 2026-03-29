//! Only 1 class can be public in java

// public class Employee{ //! Give error because of upper statement
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.print("My ID is "+id);
        System.out.println(" and Name is "+name);
    }
}

public class J_050_OOPs {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Mayur = new Employee();
        Mayur.id = 22;
        Mayur.name = "mayursonicodes";
        Mayur.printDetails();
    }
}