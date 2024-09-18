
class rectangle {

    public int l;
    public int b;

    public boolean check() {
        // return  (l == b)? true : false;
        return l==b;
    }

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }
}

public class Rect {

    public static void main(String[] args) {
        rectangle o1=new rectangle();
        rectangle o2=new rectangle();
        o1.l=2;
        o1.b=2;
        o2.l=2;
        o2.b=1;
        
        System.out.println(o2.check());
        System.out.println("AREA "+o1.area());
        System.out.println("Perimeter "+o1.perimeter());
        System.out.println("AREA "+o2.area());
        System.out.println("Perimeter "+o2.perimeter());
        
        

    }
}
