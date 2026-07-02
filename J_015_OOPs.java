//! Only 1 class can be public per file.

//! Give error
//! To use it as a public, then make a another file named as "Employee.java" and then make it public there and import it here.
// public class Employee{

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.print("My ID is "+id);
        System.out.println(" and Name is "+name);
    }
}

public class J_015_OOPs {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Mayur = new Employee();
        Mayur.id = 22;
        Mayur.name = "mayursonicodes";
        Mayur.printDetails();
    }
}