import java.util.ArrayList;

public class J_042_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        
        l1.add(1, 100); //! insert a new element into the ArrayList.
        l1.addAll(l2);

        for(int x: l1){
            System.out.print(x + " ");
        }
        System.out.println();
        
        l1.set(1, 999); //! replace an existing element at a specific index.

        for(int x: l1){
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(11));
        
    }
}