// package threading;
class My extends Thread{
    public void run(){
        int i=1;
        System.out.println("start");
        while(i<20){
            System.out.println(i+" hello ");i++;
        }
    }
}


class Mythread extends Thread{
    public void run(){
        int i=1;
        System.out.println("start");
        while(i<20){
            System.out.println(i+" hello ");i++;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // System.out.println("above ");
        My x=new My();
        x.start();
        Mythread t=new Mythread(); //object of the thread
        // t.start(); //used to start the thread
        int i=20;
        System.out.println("  below ");
        while (i>1) { 
         System.out.println(i+" World ");i--;   
        }
    }
}
