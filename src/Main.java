public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        runThreads t = new runThreads("T1");
        runThreads t2 = new runThreads("T2");
        runThreads t3 = new runThreads("T3");

        t.start();

        t2.start();

        t3.start();


    }




}
