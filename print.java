// Parent class
class Inheritance {
    void parents() {
        System.out.println("hello");
    }
}

// Child class
class Ak extends Inheritance {
    void child() {
        System.out.println("world");
    }
}

// Main class
public class print {
    public static void main(String[] args) {
        Ak c1 = new Ak();  // Object of child class
        c1.parents();      // Inherited method
        c1.child();        // Child class method
    }
}
