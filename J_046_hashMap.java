//! hashMap does not contain duplicate keys, but if it exist, it will overwrite the previous key value with the new value.

import java.util.HashMap;
public class J_046_hashMap {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 60d);
        map.put("Orange", 100d);
        map.put("Banana", 40d);
        map.put("Mango", 80d);
        
        System.out.println("Old Prices: ");

        for(String x: map.keySet()){
            System.out.println(x + " : $" + map.get(x));
        }
        
        System.out.println();
        System.out.println("New Prices: ");

        map.put("Mango", 150d); //! Overwriting the value for "Mango" key.
        
        System.out.println(map);
        System.out.println();

        System.out.println(map.get("Mango"));
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue("152"));
        System.out.println("Size of map is " + map.size());

        map.remove("Mango");
        System.out.println(map);
    }
}