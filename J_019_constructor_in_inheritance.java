//! Order of constructor called (father -> child -> grandchild)

class father{
    father(){
        System.out.println("Father with no value");
    }

    father(int a){
        System.out.println("Value of father a: "+a);
    }
}

class child extends father{
    child(){
        System.out.println("Child with no value");
    }

    child(int a, int b){
        super(a); //! "a" will be passed to father constructor.
        System.out.println("Value of child a: "+a);
        System.out.println("Value of child b: "+b);
    }
}

class grandChild extends child{
    grandChild(){
        System.out.println("GrandChild with no value");
    }

    grandChild(int a, int b, int c){
        super(a, b); //! "a, b" will be passed to child constructor.
        System.out.println("Value of GrandChild a: "+a);
        System.out.println("Value of GrandChild b: "+b);
        System.out.println("Value of GrandChild c: "+c);
    }
}

public class J_019_constructor_in_inheritance {
    public static void main(String[] args) {
        father a = new father();
        // father b = new father(10);

        // child c = new child();
        // child d = new child(100,200);

        // grandChild e = new grandChild();
        // grandChild f = new grandChild(1000,2000,3000);
    }
}