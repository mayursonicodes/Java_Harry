class MyThread1 implements Runnable{
    @Override
    public void run(){ //! Necessary to overwrite run() as it is a method of interface and don't forget to use public in interface overwrite.
        int i=0;
        while(i<50){
            System.out.println("Thread 1");
            System.out.println("Thread 11");
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thread 2");
            System.out.println("Thread 22");
            i++;
        }
    }
}

public class J_031_threads_by_implementing_runnable_interface {
    public static void main(String[] args) {
        
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}