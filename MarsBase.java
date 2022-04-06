
public class MarsBase {
    public static final String task1 = "1";
    public static final String task2 = "2";
    public static final String task3a = "3a";
    public static final String task3b = "3b";
    public static final String task4 = "4";
    public static final String task5 = "5";
    public static final String task6 = "6";

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("No Input Given Exiting .... !!");
            System.exit(-1);
        }

        String task = args[0];

        Problem p = null;
        //selecting appropriate tasks on the basis of the command line input
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
                p = new Task5();
                break;
            case task6:
                p = new Task6();
                break;
            default:
                System.out.println("Wrong Command Line Argument!!");
                System.exit(-1);
        }

        //reading input from the standara input
        p.getInput();
        //mark start
        long startTime = System.currentTimeMillis();

        //applying the algo on the input
        p.solve();

        long endTime = System.currentTimeMillis();
        //mark end
        //displaying the result t
        p.displayResult();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms\n");
    }
}


