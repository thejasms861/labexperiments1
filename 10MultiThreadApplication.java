import java.util.Random;

class Square extends Thread {
    int x;
class GenerateNumber implements Runnable {
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated Number: " + number);

    Square(int n) {
        x = n;
    }
            if (number % 2 == 0) {
                new Thread(new SquareNumber(number)).start();
            } else {
                new Thread(new CubeNumber(number)).start();
            }

    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Cube extends Thread {
    int x;
class SquareNumber implements Runnable {
    private int number;

    Cube(int n) {
        x = n;
    SquareNumber(int number) {
        this.number = number;
    }

    public void run() {
        int cub = x * x * x;
        System.out.println("Cube of " + x + " = " + cub);
        System.out.println("Square of " + number + " is " + (number * number));
    }
}

class Number extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("Random Integer generated: " + randomInteger);
            Square s = new Square(randomInteger);
            s.start();
class CubeNumber implements Runnable {
    private int number;

            Cube c = new Cube(randomInteger);
            c.start();
    CubeNumber(int number) {
        this.number = number;
    }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    public void run() {
        System.out.println("Cube of " + number + " is " + (number * number * number));
    }
}

public class MultiThreadApplication {
public class MultiThreadedApp {
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
        Thread generateThread = new Thread(new GenerateNumber());
        generateThread.start();
    }}
11)
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an exception to handle:");
        System.out.println("1. ArithmeticException");
        System.out.println("2. ArrayIndexOutOfBoundsException");
        System.out.println("3. NumberFormatException");
        System.out.println("4. StringIndexOutOfBoundsException");
        System.out.println("5. NullPointerException");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                try {
                    System.out.println("Enter numerator and denominator:");
                    int numerator = scanner.nextInt();
                    int denominator = scanner.nextInt();
                    int result = numerator / denominator;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            case 2:
                try {
                    int[] array = {1, 2, 3};
                    System.out.println("Enter index:");
                    int index = scanner.nextInt();
                    System.out.println("Element at index " + index + ": " + array[index]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Array index is out of bounds.");
                }
                break;
                
            case 3:
                try {
                    System.out.println("Enter a number:");
                    String input = scanner.next();
                    int number = Integer.parseInt(input);
                    System.out.println("Number: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid number format.");
                }
                break;
                
            case 4:
                try {
                    System.out.println("Enter a string:");
                    String str = scanner.next();
                    System.out.println("Enter index:");
                    int index = scanner.nextInt();
                    char ch = str.charAt(index);
                    System.out.println("Character at index " + index + ": " + ch);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Error: String index is out of bounds.");
                }
                break;
                
            case 5:
                try {
                    String str = null;
                    System.out.println("Length of the string: " + str.length());
                } catch (NullPointerException e) {
                    System.out.println("Error: Null pointer exception.");
                }
                break;
                
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
