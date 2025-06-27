abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();  //it gives the idea of method walk;not the actual implementation.which class extends it is mandatory that those
                             // class should be implemented the walk method;
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks with 4 legs");
    }
}

public class Oops1AbstractClass {
    public static void main(String[] args) {
        Horse h =new Horse();
        h.eat();
        h.walk();
    }
}
