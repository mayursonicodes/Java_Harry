//! In java, String is class not a primitive data type but we can use it as primitive data type because of special support.
//! Strings are immutable and can't be change.

public class J_003_string {
    public static void main(String[] args) {
        String name = new String("Mayur");
        System.out.println("Original name: "+name);
        
        name = "Tanishq"; //! Here, name value i.e. "Mayur" is not modified instead name reference changes to "Tanishq" but "Mayur" still remains in the memory and becomes eligible for garbage collection and JVM will delete it later automatically and free the memory.
        System.out.println("New name: "+name);

        String str = "Soni"; //! another way of writing string.
        System.out.println("str value is "+str);
    }
}