package ro.cni.javabasicmetrosystems.prepared.day4.threading.helper;

class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public int value() {
        return c;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        for(int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter.increment();
                }
            });
            thread.start() ;
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("LAST VALUE!");
        System.out.println(counter.value());
    }
}