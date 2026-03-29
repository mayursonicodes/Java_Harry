public class J_008_while_loop {
    public static void main(String[] args) {
        int a = 1;
        while(a<=10){
            System.out.print((a++)+" ");
        }

        System.out.println();

        while(true){ //! we cannot use while(1) in Java, it is only valid in C++.
            System.out.print((a++)+" ");
            if(a == 20) break;
        }
    }
}

//! do while, for loop, break, continue are same as C++.