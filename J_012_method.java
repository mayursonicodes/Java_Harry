//! In Java, every function is method because Java is purely object oriented programming.

public class J_012_method {
    static int sum(int a, int b){ //! We use static because, Only static method can be used inside static method.
        return a+b;
    }

    public static void main(String[] args) {
        int sum = sum(15, 5);
        System.out.println("Sum is "+sum);
    }
}

//! -------------------------------------------------------------------

// public class J_012_method{
//     int sum(int a, int b){
//         return a+b;
//     }
    
//     public static void main(String[] args) {
//         J_012_method obj = new J_012_method(); //! By using this, it is not necessary for a method to be static.
//         int sum = obj.sum(100, 50);

//         System.out.println("Sum is "+sum);
//     }
// }