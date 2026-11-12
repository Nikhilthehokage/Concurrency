public class ThreadJoin {
    
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i=0;i<5;i++ ) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Thread is running.");
            }
        };
        Thread thread=new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        //main thread keep waiting for the thread execution completion
    
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
