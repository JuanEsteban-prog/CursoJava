public class printf {
    public static void main(String[] args) {
        // printf()= Is a metod used to format output.
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("Hello, your name starts with a %c \n", firstLetter);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("You are %f inches tall  \n", height);
        System.out.printf("Employed: %b \n", isEmployed);

        // %s = String
        // %c = char
        // %d = int
        // %f = double
        // %b = boolean

        // FOR PRECISSION

        // + = output a plus
        // , = comma grouping separator
        // (= negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double priceOne = 9.99;
        double priceTwo = 100.15;
        double priceThree = -54.01;

        System.out.printf("%.1f \n", priceOne);
        System.out.printf("%.2f \n", priceTwo);
        System.out.printf("%.3f \n", priceThree);

        // width specifier
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int idOne = 1;
        int idTwo = 23;
        int idThree = 456;
        int idFour = 7890;

        System.out.printf("%04d \n", idOne);
        System.out.printf("%04d \n", idTwo);
        System.out.printf("%4d \n", idThree);
        System.out.printf("%-4d \n", idFour);

    }
}
