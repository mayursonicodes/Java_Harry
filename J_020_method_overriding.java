class base{
    public void method1(){
        System.out.println("This is method 1 of base class");
    }
}

class derived extends base{
    @Override //! This keyword is optional but helps in better understanding of which method is overridden.
    public void method1(){
        System.out.println("This is method 1 of derived class i.e. overridden.");
    }
}

public class J_020_method_overriding {
    public static void main(String[] args) {
        base a = new base();
        a.method1();

        derived b = new derived();
        b.method1();
    }
}