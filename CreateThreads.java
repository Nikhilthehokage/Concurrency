public class CreateThreads{



    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread run started");
            System.out.println("Thread run finished.");
        }
          
    }

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("MyRunnable run started.");
            System.out.println("MyRunnable run finished.");
        }
        
    }


    public static void main(String [] args){
        // 1st way to create thread using Thread class
        MyThread myThread=new MyThread();
        myThread.start();

        //2nd way to create thread using runnable interface
        Thread myRunnableThread=new Thread(new MyRunnable());
        myRunnableThread.start();

        //3rd way to create thread using anonymous class instance of runnable
        Runnable myRunnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class instance of runnable execution started.");
                System.out.println("Anonymous class instance of runnable execution finished.");
            }
            
        };

        Thread myAnonymouThread = new Thread(myRunnable);
        myAnonymouThread.start();


        //4th way to create thread using lambda function

        Runnable runnableInstance=()->{
            System.out.println("Runnable Instance run started.");
            System.out.println("Runnable Instance run finished.");
        };

        Thread myRunnableInstanceThread= new Thread(runnableInstance);
        myRunnableInstanceThread.start();
    }
    
}

/*
JVM still lives even when the main thread finishes if other threads has not finished.

*/