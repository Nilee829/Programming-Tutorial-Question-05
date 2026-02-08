public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        int res1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("Result 1: " + res1);

        int res2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result 2: " + res2);
    }
}
