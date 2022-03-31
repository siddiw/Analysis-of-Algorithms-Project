import java.util.Scanner;

public abstract class Problem1 implements Problem {
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