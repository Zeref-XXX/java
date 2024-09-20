
class Mythread extends Thread {
    public void run() {
        int i = 0;
        System.out.println("above");
        while (i <10) {
            System.out.println(i + " HEllo ");
            i++;
        }
    }
}

public class sample  {
    public static void main(String[] args) {
        // sample t = new sample();
        Mythread t=new Mythread();
        t.start();
        int i =19;
        System.out.println("below");
        while (i > 0) {
            System.out.println(i + " world ");
            i--;
        }
    }

}
