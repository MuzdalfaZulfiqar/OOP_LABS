public abstract class A {
    abstract void callme();
    // concrete methods are allowed in abstract class
    void callmeToo(){
        System.out.println("This is a concrete method");
    }
} // class ends here

class B extends A{
    void callme(){
        System.out.println("B's implementation of callme");
    }
}
