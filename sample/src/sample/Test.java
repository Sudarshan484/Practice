package sample;

class Parent {
     void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
     void display() {  // This hides the display method in Parent, doesn't override it
        System.out.println("Static method in Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        obj1.display();  // This will call Parent's display method because it's a static method
    }
}
