package javapack;

final class Constants {
    public static final double PI = 3.14;
}

// Wrapper and casting demo
class NumberHolder {
    Number value;
}

public class FinalWrapperDemo {
    public static void main(String[] args) {
        Integer i = 10; // Autoboxing
        NumberHolder nh = new NumberHolder();
        nh.value = i; // Upcasting

        if (nh.value instanceof Integer) {
            Integer newInt = (Integer) nh.value; // Downcasting
            System.out.println(newInt + 5); // 15
        }

        System.out.println(Constants.PI);
    }
}
