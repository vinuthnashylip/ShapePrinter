import java.util.Scanner;
public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Shape Printer!");
        System.out.println("Which shape would you like to print?");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        int size = 0, width = 0, height = 0;
        if (choice == 2 || choice == 3 || choice == 4) {
            System.out.print("Enter the size (e.g., 5): ");
            size = scanner.nextInt();
        }
        if (choice == 3) {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextInt();
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("Circle:");
                printCircle(size);
                break;
            case 2:
                System.out.println("Square:");
                printSquare(size);
                break;
            case 3:
                System.out.println("Rectangle:");
                printRectangle(width, height);
                break;
            case 4:
                System.out.println("Triangle:");
                printTriangle(size);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int w, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printCircle(int r) {
        for (int i = 0; i <= 2 * r; i++) {
            for (int j = 0; j <= 2 * r; j++) {
                double distance = Math.sqrt((i - r) * (i - r) + (j - r) * (j - r));
                if (distance > r - 0.5 && distance < r + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

