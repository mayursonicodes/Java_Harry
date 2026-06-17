class product_details<T, U>{
    T name;
    U price;

    product_details(T name, U price){
        this.name = name;
        this.price = price;
    }

    T getName(){
        return name;
    }

    U getPrice(){
        return price;
    }
}

public class J_049_generics {
    public static void main(String[] args) {

        product_details<String, Integer> apple = new product_details<>("apple", 100);
        product_details<String, Double> fridge = new product_details<>("fridge", 954.4851);

        System.out.println(apple.getName());
        System.out.println(apple.getPrice());

        System.out.println(fridge.getName());
        System.out.println(fridge.getPrice());
    }
}