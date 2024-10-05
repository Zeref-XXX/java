
class cars{
    void start(){
        System.out.println("Started car");
    }
    void acc(){
        System.out.println("acc car");
    }
    void gear(){
        System.out.println("gear manual");
    }
}

class lucy extends cars{
    void gear(){
        System.out.println("automatic gear");
    }
    void roof(){
        System.out.println("yes has roof");
    }
}

public class car {
    public static void main(String[] args) {
        cars c=new lucy();
        c.start();
        c.acc();
        c.gear();
       c.roof();


    }
}
