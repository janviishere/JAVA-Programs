import java.util.*;

class A {
    String name;
    void show() {
        System.out.println(name + " is eating");
    }
}

class B extends A {
    void display() {
        System.out.println(name + " is walking");
    }

    public static void main(String args[]) {
        A obj = new A();
        B obj1 = new B();

        obj.name = "Janvi";
        obj.show();

        obj1.name = "Janvi"; 
        obj1.display();
    }
}
