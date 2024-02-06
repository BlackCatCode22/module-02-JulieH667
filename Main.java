public class Main { public static int compareTwoInts(int a, int b) {
        return Math.max(a, b);
    } public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int num1 = 6798;
        int num2 = 24789;

        System.out.println("integer: " + num1);
        System.out.println("integer: " + num2);

        int largerInt = compareTwoInts(num1, num2);
        System.out.println("Larger integer: " + largerInt);

        int sum = sumTwoInts(num1, num2);
        System.out.println("Sum of the two integers: " + sum);
    }
}
