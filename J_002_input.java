import java.util.Scanner; //! Import header file for Scanner

public class J_002_input {
    public static void main(String[] args) {
        //! Taking input from the user through keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt(); //! take integer as input
        
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum is "+(num1+num2));

        System.out.print("Enter float number: ");
        float decimal = sc.nextFloat(); //! take float as input
        System.out.println("Float number is "+decimal);

        sc.nextLine(); //todo use to clear the buffer

        System.out.print("Enter string: ");
        // String str = sc.next(); //! don't take words after spaces
        String str = sc.nextLine(); //! take words with spaces
        System.out.println("String is "+str);

        System.out.print("Enter char: ");
        char ch = sc.nextLine().charAt(0); //! take char as input
        System.out.println("Char is "+ch);
    }
}