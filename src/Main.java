import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements from the user
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int numElements = scanner.nextInt();

        // Generate the Fibonacci series
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series with " + numElements + " elements:");

        // Print the first two elements
        System.out.print(first + " " + second + " ");

        // Generate and print the remaining elements
        for (int i = 3; i <= numElements; i++) {
            int next = first + second;
            System.out.print(next + " ");

            // Update values for the next iteration
            first = second;
            second = next;
        }
    }
}
