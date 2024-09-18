// package threading;

class Mythread extends Thread{
    public void run(){
        int i=1;
        while(i<20){
            System.out.println(i+" hello ");i++;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Mythread t=new Mythread(); //object of the thread
        t.start(); //used to start the thread
        int i=20;
        while (i>1) { 
         System.out.println(i+" World ");i--;   
        }
    }
}
