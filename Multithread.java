import java.util.Random;
class GenerateNumber implements Runnable {
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                new Thread(new SquareNumber(number)).start();
            } else {
                new Thread(new CubeNumber(number)).start();
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareNumber implements Runnable {
    private int number;

    SquareNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is " + (number * number));
    }
}

class CubeNumber implements Runnable {
    private int number;

    CubeNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is " + (number * number * number));
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        Thread generateThread = new Thread(new GenerateNumber());
        generateThread.start();
    }
}


