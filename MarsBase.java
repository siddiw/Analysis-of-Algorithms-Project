import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarsBase {
    public static Set<String> s = new HashSet<>();
    public static final String task1 = "1";
    public static final String task2 = "2";
    public static final String task3a = "3a";
    public static final String task3b = "3b";
    public static final String task4 = "4";
    public static final String task5 = "5";
    public static final String task6 = "6";

    public static void main(String[] args) {
        s.add(task1);
        s.add(task2);
        s.add(task3a);
        s.add(task3b);
        s.add(task4);
        s.add(task5);
        s.add(task6);

        if (args.length != 1) {
            System.out.println("No Input Given Exiting .... !!");
            System.exit(-1);
        }

        String task = args[0];

        if (!s.contains(task)) {
            System.out.println("Invalid input. Exiting .... !!");
            System.exit(-1);
        }

        Problem p = null;
        switch (task) {
            case task1:
                p = new Task1();
                break;
            case task2:
                p = new Task2();
                break;
            case task3a:
                p = new Task3a();
                break;
            case task3b:
                p = new Task3b();
                break;
            case task4:
                p = new Task4();
                break;
            case task5:
                p = new Task4();
                break;
            case task6:
            default:
                System.out.println("Tata.. Bye Bye..Khatam..!!");
                System.exit(-1);
        }

        p.getInput();
        long startTime = System.currentTimeMillis();
        p.solve();
        long endTime = System.currentTimeMillis();
        p.displayResult();
        System.out.println(endTime-startTime);
    }
}

interface Problem {
    void getInput();
    void solve();
    void displayResult();
}

abstract class Problem1 implements Problem {
    public int[] arr;
    Scanner scanner = new Scanner(System.in);
    int l=0,r=0,sum=0;

    public void getInput() {
        int n = scanner.nextInt();
        arr = new int[n];
        int count = 0;
        while (count < n) {
            arr[count++] = scanner.nextInt();
        }

    }

    public abstract void solve();

    public void displayResult(){
        System.out.println(String.format("%d %d %d",l,r,sum));
    }
}

class Task1 extends Problem1 {
    @Override
    public void solve() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

class Task2 extends Problem1 {
    @Override
    public void solve() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

class Task3a extends Problem1 {
    @Override
    public void solve() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

class Task3b extends Problem1 {
    @Override
    public void solve() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}


abstract class Problem2 implements Problem {
    public int[][] mat;
    int x1,y1,x2,y2,sum;
    Scanner scanner = new Scanner(System.in);

    public void getInput() {
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        mat = new int[m][n];
        int rowcount = 0;
        int colcount = 0;

        while (rowcount < m) {
            while (colcount < n) {
                mat[rowcount][colcount++] = scanner.nextInt();
            }
            colcount = 0;
            rowcount++;
        }

    }

    public abstract void solve();

    public void displayResult(){
        System.out.println(String.format("%d %d %d %d %d",x1,y1,x2,y2,sum));
    }

}

class Task4 extends Problem2 {
    public void solve() {
        for (int[] row : mat) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println("");
        }
    }
}

class Task5 extends Problem2 {
    public void solve() {
        for (int[] row : mat) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println("");
        }
    }
}

class Task6 extends Problem2 {
    public void solve() {
        for (int[] row : mat) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println("");
        }
    }
}