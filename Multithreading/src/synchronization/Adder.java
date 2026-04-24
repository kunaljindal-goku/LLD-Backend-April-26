package synchronization;

import java.util.concurrent.Callable;

public class Adder implements Runnable {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++) {
            if(i==50) {
                try {
                    Thread.sleep(10000);
                    System.out.println("Hello");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.value.x += i;
        }
    }

//    @Override
//    public Void call() throws Exception {
//        for(int i=1;i<=100;i++) {
//            this.value.x += i;
//        }
//        return null;
//    }
}
