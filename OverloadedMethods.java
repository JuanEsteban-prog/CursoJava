class OverloadaedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different
        // parameters

        // Each method has a unique method signature
        // signature = name + parameters

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }
}