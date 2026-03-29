// import java.util.Scanner;

// public class J_007_switch_case {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the grade: ");
//         String grade = sc.next();

//         switch (grade) {
//             case "a": //! we can use this if we don't want to convert to upper case just don't use break.
//             case "A":
//                 System.out.println("Passed by A grade.");
//                 break;
//             case "B":
//                 System.out.println("Passed by B grade.");
//                 break;
//             case "C":
//                 System.out.println("Passed by C grade.");
//                 break;
//             default:
//                 System.out.println("Sorry! You are fail.");
//         }
//     }
// }

//! --------------------------------------------------------------------------------
//! Another new enhanced method to use "switch case"

public class J_007_switch_case {
    public static void main(String[] args) {
        String var = "Shubham";

        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}