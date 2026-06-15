//! hashSet don't allow duplicate values and key value pairs like hashMap.
import java.util.HashSet;

public class J_045_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);
        
        System.out.println(h);
    }
}