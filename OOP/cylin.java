


class cylinder {

    public int radius;
    public int height;

    public double lidarea(){
        return Math.PI*radius*radius;
    }
    public double totalsurfacearea(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}  

public class cylin {

    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.radius =1;
        c1.height=2;

        System.out.println("Lid area "+ c1.lidarea());
        System.out.println("Totat surface "+c1.totalsurfacearea());
        System.out.println("VOlume "+c1.volume());
    }
}
