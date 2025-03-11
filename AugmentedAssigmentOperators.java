public class AugmentedAssigmentOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;// Modulos, tell us the remain of the division
        System.out.println(x);

        // Order of operations (P-E-M-D-A-S)
        // Parenthesis, exponents, multiplication, division, addition, substraction.
        double results = 3 + 4 * (7 - 5) / 2.0;
        // results = 3 + 4 * 2 / 2.0
        // results = 3 + 8 / 2
        // results = 3 + 4
        // results = 7

        System.out.println(results);
    }
}