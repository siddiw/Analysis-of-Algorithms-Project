import java.util.Scanner;

public abstract class Problem2 implements Problem {
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
