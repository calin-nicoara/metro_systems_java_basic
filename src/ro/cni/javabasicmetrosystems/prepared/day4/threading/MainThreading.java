package ro.cni.javabasicmetrosystems.prepared.day4.threading;

public class MainThreading {
    public static void main(String[] args) throws InterruptedException {
        simpleExample();
    }

    private static void simpleExample() {
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        final Thread thread = new Thread(exampleRunnable);
        thread.start();

        ExampleThread exampleThread = new ExampleThread();
        exampleThread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        System.out.println("Finished thread");
        System.out.println();
    }

    private static class ExampleRunnable implements Runnable {

        @Override
        public void run() {
//            System.out.println(Thread.currentThread().getName());
            System.out.println("Test runnable");
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Test runnable after sleep");
        }
    }

    private static class ExampleThread extends Thread {
        @Override
        public void run() {
//            System.out.println(Thread.currentThread().getName());
            System.out.println("Test thread");
            System.out.println();
        }
    }
}
