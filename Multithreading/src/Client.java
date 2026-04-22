import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        System.out.println("Hello World" + " Thread name = "+Thread.currentThread().getName());
//
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread t1 = new Thread(helloWorldPrinter);
//        t1.start();

        // print 1-100 using 100 separate threads

//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }

        ExecutorService ex = Executors.newFixedThreadPool(5);
        for(int i=1;i<=100;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            ex.submit(numberPrinter);
        }

        ex.shutdown();
    }
}
