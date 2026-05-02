public class J_005_string_methods {
    public static void main(String[] args) {
        String a = "    Mayur Soni is great    ";
        System.out.println(a);

        System.out.println(a.length()); //! In string -> "length()", In array -> "length"

        // System.out.println(a.toLowerCase());
        // System.out.println(a.toUpperCase());

        // System.out.println(a.trim()); //! Remove whitespaces from starting and ending of string.

        // System.out.println(a.substring(0));
        // System.out.println(a.substring(10, 14)); //! substirng(start, end). end is excluding.

        // System.out.println(a.replace('a', 'Z')); //! replacae old char with the new char.
        // System.out.println(a.replace("is", "will be"));

        // System.out.println(a.startsWith(" "));
        // System.out.println(a.endsWith("t"));

        // System.out.println(a.charAt(4)); //! return character at given index.

        // System.out.println(a.indexOf('M')); //! return the index of first occurance of the character else -1.
        // System.out.println(a.indexOf("Mayur"));
        // System.out.println(a.indexOf('a', 10)); //! search starts from index 10.

        // System.out.println(a.lastIndexOf('a')); //! search starts from end.
        // System.out.println(a.lastIndexOf('a', 10)); //! search starts from index 10 and goes to start(index 0).

        // System.out.println(a.equals("    Mayur sONI is great    "));
        // System.out.println(a.equalsIgnoreCase("    mAYur sONI is great    "));

        // System.out.println("hello \" hi"); //! escape sequence character
        
        // System.out.println(a.contains("mayur")); //! check whether present in the string or not.

        // System.out.println(Character.isLetter('a'));
        // System.out.println(Character.isLetter(a.charAt(2))); //! check whether letter or not.
        // System.out.println(Character.isDigit(a.charAt(2))); //! check whether digit or not.

        //! split() is used to break a string into parts based on a delimiter/string and return an array of Strings.
        // String[] arr = a.split(" "); //! we can use String also in this.
        // for(String ch: arr){
        //     System.out.println(ch);
        // }

        //! toCharArray() converts a String into a character array (char[]).
        // char arr1[] = a.toCharArray();
        // for(char ch1: arr1){
        //     System.out.println(ch1);
        // }

    }
}