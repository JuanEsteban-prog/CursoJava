class Variables {
    public static void main(String[] args) {
        // variable = reusable container for a value
        // a variables behaves as if it was the value it contains

        // primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs reference
        // int string
        // double array
        // char object
        // boolean

        int year = 2025;
        int age = 21;

        double price = 19.99;
        double tax = 0.07;

        char grade = 'A';
        char sign = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        String name = "Juan Esteban";
    }
}