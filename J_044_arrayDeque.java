//! Read documentation for more details.
import java.util.ArrayDeque;

public class J_044_arrayDeque {

    static void print(ArrayDeque<?> d){
        for(Object x: d){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();

        d1.add(10);
        print(d1);

        d1.addLast(20);
        print(d1);

        d1.addFirst(99);
        print(d1);

    }
}