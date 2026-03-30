//! Java does not support multiple inheritance.

class base{
    int x;

    void setBase(int x){
        this.x = x;
    }

    public void getBase(){
        System.out.println("Value of base x is "+x);
    }
}

class derived extends base{
    int y;

    public void setDerived(int y){
        this.y = y;
    }

    public void getDerived(){
        System.out.println("Value of derived y is "+y);
    }
}

public class J_018_inheritance {
    public static void main(String[] args) {

        base b = new base();
        b.setBase(10);
        b.getBase();

        System.out.println("------------------------");

        derived d = new derived();
        d.x = 15;
        d.y = 20;
        d.getBase();
        d.getDerived();
    }
}