package Interface;

public class Interface {
    // Interface = A blueprint for a class that specifies a set of abstract methods
    // that implementing class MUST define. Supports multiple inheritance-like
    // behavior.
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
