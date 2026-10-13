import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean prime = true;

            if (num < 2) {
                prime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }
    }
}
