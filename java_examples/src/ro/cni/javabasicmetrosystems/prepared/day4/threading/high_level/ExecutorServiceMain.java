package ro.cni.javabasicmetrosystems.prepared.day4.threading.high_level;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new ExampleRunnable());
        executorService.execute(new ExampleRunnable());
        executorService.execute(new ExampleRunnable());
        executorService.execute(new ExampleRunnable());

        executorService.shutdown();
    }

    static class ExampleRunnable implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    }
}
