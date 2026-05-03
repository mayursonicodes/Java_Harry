//! Interface is a group of methods with empty bodies and need to be overridden in child class.
//! Interface can have methods with definations but with special keywords like default, static, or private.
//! Interface supports multiple inheritance.
//! Methods in interfaces are by default: public & abstracted.
//! Attributes/Variables are final(constant) in interface and cannot be changed in main method or indirectly using setters.
//! We can not create object of interface but we can create reference.

interface Bicycle{
    int a = 10; //! Automatically public static final int a = 10;
    void applyBrake(int decrement); //! Same as public abstract void applyBrake(int decrement);
    void speedUp(int increment);
}

//! Use "implements" instead of "extends".
class AtlasCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Pee");
    }

    //! This method will also give error as it is modifying properties of interface.
    // void changed(int a){
    //     this.a = a;
    // }

    //! Necessary to use "public" in interface overriding, otherwise give error.
    public void applyBrake(int decrement){
        System.out.println("Applying Brake.");
    }

    public void speedUp(int increment){
        System.out.println("Speeding Up.");
    }
}

public class J_023_interface {
    public static void main(String[] args) {

        AtlasCycle mayurCycle = new AtlasCycle();
        mayurCycle.applyBrake(50);
        System.out.println(mayurCycle.a);

        //! Cannot modify the properties of interface as they are final(constant).
        // mayurCycle.a = 100;
    }
}