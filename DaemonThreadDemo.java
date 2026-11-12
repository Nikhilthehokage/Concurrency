public class DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread executing.");
        Runnable runnable=()->{
            while (true) { 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Thread is running");
            }
        };
        
        Thread thread = new Thread(runnable);
        //thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Main thread execution completed.");
    }
}
