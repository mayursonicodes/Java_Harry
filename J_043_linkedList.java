import java.util.LinkedList;

public class J_043_linkedList {

    //! Important
    static void print_list(LinkedList<?> l){
        for(int i=0; i<l.size(); i++){
                System.out.print(l.get(i) + " ");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        print_list(l1);

        l1.add(1, 100); //! insert a new element into the ArrayList.
        l1.addAll(l2);

        print_list(l1);
        
        l1.set(1, 999); //! replace an existing element at a specific index.

        print_list(l1);
        
        l1.addLast(1111);
        l1.addFirst(1111);

        print_list(l1);

        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(15));
    }
}