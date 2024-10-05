
class Super{
    void display(){
        System.out.println("Hello super");
    }
}

class  sub extends Super{
    @Override
    void display(){
        System.out.println("Hello subclass");
    }
}

public class overriding {
    public static void main(String[] args) {
        // Super s=new sub();
        Super sup = new Super();
        sup.display();

        sub s=new sub();
        s.display();

        Super su=new sub();
        su.display();
    }
}
