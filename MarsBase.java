import java.util.HashSet;
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


