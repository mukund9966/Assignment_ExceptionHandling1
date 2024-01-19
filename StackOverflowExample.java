package ExceptionHandling;

public class StackOverflowExample {
    public static void main(String[] args) {
        try {
            recursion(0);
        } catch (StackOverflowError e) {
            System.out.println(" StackOverflowError: " + e.getMessage());
        }
    }

    private static void recursion(int count) {
        recursion(count);
    }
}

