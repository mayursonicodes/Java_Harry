//! We can not create object of abstract class but we can create reference and than points to the derived class.
//! We can create an abstract class from abstract class also.
//! An abstract class must contain at least 1 abstract method.

abstract class parent{
    parent(){
        System.out.println("Parent constructor is called.");
    }

    abstract public void name();
}

class child1 extends parent{
    child1(){
        System.out.println("Child 1 constructor is called.");
    }

    @Override
    public void name() {
        System.out.println("My name is Child 1.");
    }
}

abstract class child2 extends parent{
    child2(){
        System.out.println("Child 2 constructor is called.");
    }

    //! If we will not override here it will also works but, If we create a another class which extensds this than it is necessary to override it.
    @Override
    public void name() {
        System.out.println("My name is Child 2.");
    }
}

public class J_022_abstract_class {
    public static void main(String[] args) {
        child1 a = new child1();
        a.name();
    }
}