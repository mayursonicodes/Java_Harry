public class J_014_varArgs {
    
    static void sum(int x, int ...arr){ //! We can also use sum(int ...arr) only.
        //! "int ...arr" --> "int arr[]"
        int result = x;
        System.out.println("Arguments: "+arr.length);

        for(int i: arr)
            result += i;

        System.out.println(result);
    }

    public static void main(String[] args) {
        sum(10);
        sum(10, 5);
        sum(10, 10, 10);
    }
}