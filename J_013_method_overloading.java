//! Method Overloading means methods with same name but different parameters.

public class J_013_method_overloading {
    static void sum(int a, int b){
        System.out.println("Sum is "+(a+b));
    }

    static void sum(int a, int b, int c){
        System.out.println("Sum is "+(a+b+c));
    }
    
    static void sum(int a, float b){
        System.out.println("Sum is "+(a+b));
    }
    public static void main(String[] args) {
        sum(15, 5);
        sum(10, 5, 10);
        sum(5, .5f);
    }
}