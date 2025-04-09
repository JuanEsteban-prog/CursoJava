public class Math {
    public static void main(String[] args) {
        System.out.println(java.lang.Math.PI);
        System.out.println(java.lang.Math.E);

        double result;

        result = java.lang.Math.pow(2, 3); // 2^3
        System.out.println(result);
        result = java.lang.Math.abs(-5); // |result|
        System.out.println(result);
        result = java.lang.Math.sqrt(9);
        System.out.println(result);
        result = java.lang.Math.round(4.1231432); // round to nearest integer
        System.out.println(result);
        result = java.lang.Math.ceil(4.1231432); // round up
        System.out.println(result);
        result = java.lang.Math.floor(3.9999999); // round down
        System.out.println(result);
        result = java.lang.Math.max(5, 10); // max of two numbers
        System.out.println(result);
        result = java.lang.Math.min(5, 10); // min of two numbers
        System.out.println(result);
    }
}
