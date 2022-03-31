public class Task6 extends Problem2 {
    public void solve() {
        for (int[] row : mat) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println("");
        }
    }
}