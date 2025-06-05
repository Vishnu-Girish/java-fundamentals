package javapack;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Underage not allowed!");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
