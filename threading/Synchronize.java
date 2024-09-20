
// import javax.xml.crypto.Data;

class MyThread1 extends Thread {

    MyData d;

    public MyThread1(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("Hello world");
    }
}

class MyThread2 extends Thread {

    MyData dat;

    public MyThread2(MyData data) {
        dat = data;
    }

    public void run() {
        dat.display(" WELCOME");
    }
}

class MyData {

    void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
public class Synchronize {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}
