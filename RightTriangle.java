import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char triangleChar = scanner.next().charAt(0);

        System.out.print("Enter triangle height: ");
        int triangleHeight = scanner.nextInt();

        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(triangleChar + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}