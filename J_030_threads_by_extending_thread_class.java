class MyThread1 extends Thread{
    @Override
    public void run(){ //! Necessary to use public as In the Thread class, the run() method is declared as public void run();
        int i=0;
        while(i<50){
            System.out.println("Thread 1");
            System.out.println("Thread 11");
            i++;
        }
    }
}

class MyThread2 extends Thread{
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

public class J_030_threads_by_extending_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();       
    }
}