import java.util.Scanner;

public class TestMyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the size of the array? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer value: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The Size of my array is: " + numbers.length);
        System.out.println("Original order:");
        for (int value : numbers) {
            System.out.println(value);
        }

        System.out.println("Reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
