public class J_006_if_else {
    public static void main(String[] args) {
        int age = 8;
        // if(age) //! Will not work in Java, it only works in C++.
        if(age>=18){ 
            System.out.println("Above 18");
        }
        else{
            System.out.println("Below 18");
        }
    }
}