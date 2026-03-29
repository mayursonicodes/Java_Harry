public class J_004_print_types {
    public static void main(String[] args) {
        System.out.print("Hello1 "); //! 1st way
        System.out.println("Hello2"); //! 2nd way

        float a = 2.5f;
        System.out.printf("Value of a is %f", a); //! 3rd way
        System.out.println();
        System.out.format("Value of a is %f", a); //! 4th way
    }
}