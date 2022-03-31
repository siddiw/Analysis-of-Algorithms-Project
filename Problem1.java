import java.util.Scanner;

public abstract class Problem1 implements Problem {
    public int nsize;
    public int[] arrAQI;
    Scanner scanner = new Scanner(System.in);
    int l = -1, r = -1, sum = 0;

    public void getInput() {
        nsize = scanner.nextInt();
        arrAQI = new int[nsize];
        int count = 0;
        while (count < nsize) {
            arrAQI[count++] = scanner.nextInt();
        }
    }

    public abstract void solve();

    public void displayResult() {
        System.out.println(String.format("%d %d %d", l, r, sum));
    }
}