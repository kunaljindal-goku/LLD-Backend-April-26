package synchronization;

import mergeSort.Sorter;

import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value(0);
        Adder adder = new Adder(value);
        Subtracter subtracter = new Subtracter(value);

        ExecutorService ex = Executors.newFixedThreadPool(2);
//        Future<Void> futureAdder = ex.submit(adder);
//        Future<Void> futureSub = ex.submit(subtracter);
        ex.execute(adder);
        ex.execute(subtracter);

//        futureAdder.get();
//        futureSub.get();

        System.out.println(value.x);
    }
}
