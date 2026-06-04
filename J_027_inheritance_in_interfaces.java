interface animal{
    void eat();
}

interface dog extends animal{
    void bark();
}

class petDog implements dog{
    public void eat(){
        System.out.println("Dog is eating.");
    }
    public void bark(){
        System.out.println("Dog is barking.");
    }
}

public class J_027_inheritance_in_interfaces {
    public static void main(String[] args){
        petDog d = new petDog();
        d.eat();
        d.bark();        
    }
}