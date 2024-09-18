// package threading;

class My implements java.lang.Runnable {

    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " hello ");
            i++;
        }
    }
}

public class Runnable {
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i = 20;
        while (i > 0) {
            System.out.println(i + " World ");i--;
        }
    }
}
