public class LogicalOperators {
    public static void main(String[] args) {
        // ALlow us to check or modify one condition
        // AND = && All conditions must be true.
        // OR = || Only one condition is going to be true.
        // NOT = !

        double temperature = -20;
        boolean isSunny = false;

        if (temperature <= 30 && temperature >= 0 && isSunny) {
            System.out.println("The weather is good ");
            System.out.println("It is Sunny outside");
        } else if (temperature <= 30 && temperature >= 0 && !isSunny) {
            System.out.println("The weather is good ");
            System.out.println("It is cloudy outside");
        } else if (temperature > 30 || temperature < 0) {
            System.out.println("The weather is bad");
        }
    }
}
