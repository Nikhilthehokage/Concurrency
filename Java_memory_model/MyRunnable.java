package Java_memory_model;

public class MyRunnable implements Runnable{

    private int count;
    private MyObject myObject;

    public MyRunnable(MyObject myObject){
        this.myObject=myObject;
    }

    @Override
    public void run() {
       System.out.println("Thread - "+Thread.currentThread().getName()+". myObject = "+myObject);
       for (int i=0;i<1_00_000;i++) {
        //Added synchronised block to solve data visibility problem
          synchronized (this) {
               count++;
          }
       }
       System.out.println("Thread - "+Thread.currentThread().getName()+" executed. count = "+count);
    }
    
}
