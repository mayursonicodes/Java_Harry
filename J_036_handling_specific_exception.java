import java.util.Scanner;

public class J_036_handling_specific_exception {
    public static void main(String[] args) {
        int arr[] = new int [3];
        arr[0] = 54;
        arr[1] = 100;
        arr[2] = 38;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the index of array: ");
        int idx = sc.nextInt();

        System.out.println("Enter the number from which you want to divide: ");
        int num = sc.nextInt();

        try{
            System.out.println("The value at index " + idx + " is: " + arr[idx]);
            System.out.println("The value of " + arr[idx] + "/" + num + " is: " + arr[idx]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Error Occured: " + e);
            System.out.println("Try to divide with non-zero number.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Occured: " + e);
            System.out.println("Enter the index number under it's bound.");
        }
        catch(Exception e){
            System.out.println("Error Occured: " + e);
        }
    }
}