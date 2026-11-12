package Java_memory_model;

public class SharedObjectsInRunnables {

    public static void main(String[] args) {
        MyObject myObject=new MyObject();
        MyRunnable myRunnable1=new MyRunnable(myObject);
        MyRunnable myRunnable2=new MyRunnable(myObject);

        Thread thread1= new Thread(myRunnable1,"Thread1");
        Thread thread2= new Thread(myRunnable2,"Thread2");

        thread1.start();
        thread2.start();

    }
    
}
