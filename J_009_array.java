//! Array in Java is an object of a special class.

public class J_009_array {
    public static void main(String[] args) {
        //! Method 1
        int arr1[] = new int [5];
        arr1[0] = 11;
        System.out.println(arr1[0]);

        //! Method 2
        int []arr2 = new int [5];
        arr1[0] = 22;
        System.out.println(arr1[0]);

        //! Method 3
        float arr3[] = {33.3f, 45.54f}; //! float array
        System.out.println(arr3[0]);

        //! Method 4
        int arr4[];
        arr4 = new int[]{44, 87};
        System.out.println(arr4[0]);

        //! Give error, this is wrong way
        // int[] arr5;
        // arr5 = {1,2,3};
    }
}