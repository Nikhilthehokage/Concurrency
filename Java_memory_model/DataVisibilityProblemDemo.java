package Java_memory_model;

public class DataVisibilityProblemDemo {
    public static void main(String[] args) {
        MyObject myObject=new MyObject();
        MyRunnable myRunnable=new MyRunnable(myObject);
        Thread thread1=new Thread(myRunnable,"Thread1");
        Thread thread2=new Thread(myRunnable,"Thread2");
        thread1.start();
        thread2.start();


    }
}
