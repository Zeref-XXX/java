// package java abdul.inheritance;

class Parent {

    Parent() {
        System.out.println("Non parametrized  parent constructor");
    }

    Parent(int x) {
        System.out.println("Parameterized constructor " + x);
    }
}

class child extends Parent {

    child() {
        System.out.println("non parametrized child constructor");
    }

    child(int b) {
        System.out.println("parametrized const of child ");
    }

    child(int x, int y) {
        super(y);
        System.out.println("2 parametrized child " + x + " " + y);
    }
}

public class Superconst {

    public static void main(String[] args) {
        child c = new child(1, 3);

    }
}
