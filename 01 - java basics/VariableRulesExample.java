public class VariableRulesExample {
    public static void main(String[] args) {
        int age = 25;
        int Age = 30;
        // System.out.println(AGE); // invalid
        System.out.println("age: " + age + ", Age: " + Age);

        int number = 5;
        int _count = 10;
        int $price = 100;
        // int 1number = 5; // invalid
        // int @rate = 50; // invalid
        // int #marks = 90; // invalid
        System.out.println("number: " + number + ", _count: " + _count + ", $price: " + $price);

        int totalAmount = 500;
        // int total amount = 500; // invalid
        System.out.println("totalAmount: " + totalAmount);

        int classNumber = 10;
        // int class = 10; // invalid
        // int public = 5; // invalid
        System.out.println("classNumber: " + classNumber);
    }

}
