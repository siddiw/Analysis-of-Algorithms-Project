import java.util.Scanner;

public abstract class Problem2 implements Problem {
    public int msize, nsize;
    public int[][] matAQI;
    int x1 = -1, y1 = -1, x2 = -1, y2 = -1, sum;
    Scanner scanner = new Scanner(System.in);

    public void getInput() {
        //row size of matrix
        msize = scanner.nextInt();
        //column size of matrix
        nsize = scanner.nextInt();
        matAQI = new int[msize][nsize];
        int rowcount = 0;
        int colcount = 0;

        while (rowcount < msize) {
            while (colcount < nsize) {
                matAQI[rowcount][colcount++] = scanner.nextInt();
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
