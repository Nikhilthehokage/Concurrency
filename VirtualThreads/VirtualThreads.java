package VirtualThreads;

public class VirtualThreads {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
             @Override
            public void run() {
               System.out.println("Running virtual Thread");
            }
        };

        Thread myThread=Thread.ofVirtual().start(runnable);
        try {
            myThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
