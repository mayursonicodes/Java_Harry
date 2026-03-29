public class J_010_array_traversal {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};

        System.out.println("Length of arr is "+arr.length); //! Don't use "()" after length as array is class/object in Java and length is the attribute of this class.

        //! Using For loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //! Using ForEach loop
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}