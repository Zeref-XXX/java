
class Mythread extends Thread {

    public void run() {
        int count = 0;
        while (true) {
            System.out.println(count++ +" My thread");
            // try {
            //     // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     System.out.println(e);
            // }
        }
    }

    // public Mythread(String name) {
    //     super(name);
    //     // setPriority(Thread.MIN_PRIORITY+2);
    // }
}

public class ThreadTest {

    public static void main(String[] args) throws Exception{
        // Mythread t = new Mythread("My thread  1");
        // // t.setPriority(6);
        // System.out.println("ID "+t.getId());
        // System.out.println("NAme "+t.getName());
        // System.out.println("priority "+t.getPriority());
        // System.out.println("state "+t.getState());
        // System.out.println("Alive "+t.isAlive());
        // t.setDaemon(true); //main terminate the daemon thread terminate
        Mythread t=new Mythread();
        t.start();
        // t.interrupt();
        // try {
        //     Thread.sleep(100);
        // } catch (Exception e) {
        // }
        // Thread mainThread=Thread.currentThread();
        // mainThread.join(); 
        int count = 0;
        while (true) {
            System.out.println(count++ +" Main ");
            Thread.yield();
        }
    }
}
