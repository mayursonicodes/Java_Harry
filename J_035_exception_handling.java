public class J_035_exception_handling {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(Exception e){
            System.out.println("Error Occured: "+e);
        }

        System.out.println("End of Program...");
    }
}