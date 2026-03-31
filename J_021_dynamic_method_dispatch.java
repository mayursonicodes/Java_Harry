class vehicle{
    public void status(){
        System.out.println("Vechile is moving.");
    }

    public void name_vehicle(){
        System.out.println("This is Vehicle.");
    }
}

class car extends vehicle{
    @Override
    public void status(){
        System.out.println("Car is moving.");
    }
    
    public void name_car(){
        System.out.println("This is Car.");
    }
}

public class J_021_dynamic_method_dispatch {
    public static void main(String[] args) {

        // vehicle a = new vehicle();
        // a.status();
        // a.name_vehicle();
        
        // car b = new car();
        // b.status();
        // b.name_car();
        
        //! derived --> base  ❌❌
        //! base --> derived ✅✅
        // car c = new vehicle(); //! Give error, as base object does NOT contain the extra members/functions of derive.
        
        vehicle c = new car(); //! This is valid.
        c.name_vehicle();

        // c.name_car(); //! Give error, as Compiler only checks methods inside base(vehicle) class.

        c.status(); //! It calls derived(car) class method because, In Java Virtual keyword is default like C++. Also called dynamic binding.
    }
}