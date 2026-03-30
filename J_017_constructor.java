class Employee{
    private int id;
    private String name;

    public Employee(int id, String name){ //! We can overload the constructor also.
        this.id = id;
        this.name = name;
    }

    void getDetails(){
        System.out.print("My ID is "+id);
        System.out.println(" and Name is "+name);
    }
}

public class J_017_constructor {
    public static void main(String[] args) {
        Employee Mayur = new Employee(7, "Thala");
        Mayur.getDetails();
    }
}