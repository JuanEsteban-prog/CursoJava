public class VaribleScope {
    int x = 3;// CLASS

    public static void main(String[] args) {
        // variable scope = where a variable can be accessed(Local and class)
        // A variable declared inside of a method has a local scope
        // A variable declared inside of a class has a class scope
        int x = 1; // LOCAL
        System.out.println(x);
        doSomething();
    }

    static void doSomething() {
        int x = 2; // LOCAL
        System.out.println(x);
    }
}
