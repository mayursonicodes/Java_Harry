//! There are various constructor of thread. Check online for use.
//! One of the constructor is demonstrated below

class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
    }
    
    public void run(){
        System.out.println("Thread 1 running...");
    }
}

class MyThread2 extends Thread{
    MyThread2(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread 2 running...");
    }
}

public class J_032_constructors_of_thread {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1("Mayur");
        t1.start();

        MyThread1 t2 = new MyThread1("Ram");
        t2.start();

        MyThread2 t3 = new MyThread2("Harry");
        t3.start();

        System.out.println("The name of thread t1 is "+ t1.getName());
        System.out.println("The id of thread t1 is "+ t1.getId());

        System.out.println();
        
        System.out.println("The name of thread t2 is "+ t2.getName());
        System.out.println("The id of thread t2 is "+ t2.getId());

        System.out.println();
        
        System.out.println("The name of thread t3 is "+ t3.getName());
        System.out.println("The id of thread t3 is "+ t3.getId());
        
    }
}