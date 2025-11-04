public class TypeConversionExample {
    public static void main(String[] args) {
        // IMPLICIT (Widening) | Small → Big | Safe and automatic
        int smallBucket = 100; // int = 4 bytes
        double bigBucket = smallBucket; // double = 8 bytes
        System.out.println("int: " + smallBucket);
        System.out.println("double: " + bigBucket);

        // EXPLICIT (Narrowing) | Big → Small | Manual and risky
        double largeBucket = 99.99;
        int tinyBucket = (int) largeBucket;
        System.out.println("double: " + largeBucket);
        System.out.println("int: " + tinyBucket);
    }
}