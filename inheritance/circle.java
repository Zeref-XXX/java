// package java abdul.inheritance;

class circle {

    class c {

        public double radius;

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double cicumference() {
            return perimeter();
        }
    }
    class static cyclinder extends c{
        public double height;
        public double volume(){
            return area()*height;

        }
    }
    public static void main(String[] args) {
        cylinder r=new cyclinder();

    }
}
