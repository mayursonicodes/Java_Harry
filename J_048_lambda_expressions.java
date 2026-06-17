//! A lambda expression is a shorter way to implement a functional interface.
//! Functional interface :- An interface with exactly one abstract method.

//! Functional interface
interface calculator {
    int add(int a, int b);
}

//! We can also do this but it takes more time to code, number of code lines also increases and along with it we have to create a new class also. So not efficient.
// class phone implements calculator{
//     public int add(int a, int b){
//         return a+b;
//     }
// }

public class J_048_lambda_expressions {
    public static void main(String[] args) {

        //! We can also use this but for this we have to create a phone class that implements calculator and we have to overwrite "add" method in it & it's take time and extra code.
        // phone p = new phone();
        // System.out.println("Sum is " + p.add(100, 10));

        //! Lambda expression
        calculator c = (a, b) -> {
            return a+b;
        };

        System.out.println("Sum is " + c.add(5, 10));
    }
}