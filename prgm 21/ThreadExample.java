import java.util.Scanner;


class FibonacciRunnable implements Runnable {
    int n;

    FibonacciRunnable(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}


class EvenRunnable implements Runnable {
    int start, end;

    EvenRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers in Range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        FibonacciRunnable f = new FibonacciRunnable(n);
        EvenRunnable e = new EvenRunnable(start, end);


        Thread t1 = new Thread(f);
        Thread t2 = new Thread(e);


        t1.start();
        t2.start();
    }
}
