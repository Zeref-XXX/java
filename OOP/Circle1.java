
class Circle {
        public double radius;
        public  double  area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double circumference() {
            return perimeter();
        }
}

public class Circle1 {

    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle();
        c1.radius=2;
        c2.radius=1;
        
        System.out.println("Area " + c1.area());
        System.out.println("perimeter "+c1.perimeter());
        System.out.println("circumference "+c1.circumference());
        System.out.println(c2);
        System.out.println("Areaa 2 "+ c2.area());
        System.out.println(c2.circumference());
        System.out.println(c2.perimeter());
        // c1.
    }
}