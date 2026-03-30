//! 4 types of accesss modifiers
//! private, default, public, protected

class Employee{
    String name;
    private int id; //! cannot access directly, we need getter and setter

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
} 

public class J_016_access_modifiers {
    public static void main(String[] args) {
        Employee mayur = new Employee();

        mayur.name = "mayursonicodes";
        System.out.println(mayur.name);

        mayur.setId(22); //! Setter
        System.out.println(mayur.getId()); //! Getter
    }
}