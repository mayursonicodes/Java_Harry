//! class A extends class B; ✅
//! class A extends interface B; ❌
//! class A implements class B; ❌
//! class A implements interface B; ✅

//! interface A extends class B; ❌
//! interface A extends interface B; ✅
//! interface A implements class B; ❌
//! interface A implements interface B; ❌

//todo [J_024.png]

interface Bicycle{
    int a = 10;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHorn();
}

class AtlasCycle implements Bicycle, HornBicycle{
    public void blowHorn(){
        System.out.println("Pee Pee Pee !");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Brake.");
    }

    public void speedUp(int increment){
        System.out.println("Speeding Up.");
    }
}

public class J_024_multiple_interface {
    public static void main(String[] args) {

        AtlasCycle mayurCycle = new AtlasCycle();
        mayurCycle.blowHorn();
        mayurCycle.applyBrake(50);

    }
}