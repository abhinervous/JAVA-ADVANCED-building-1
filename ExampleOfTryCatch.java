public class ExampleOfTryCatch {
    public static void main(String[] args) {
        
    try {
        int x = 10 / 0;
    }
    catch (ArithmeticException e) {
        System.out.println("Error handeled");

    }
    finally {
        System.out.println("Always Runs");
    }
}
}

