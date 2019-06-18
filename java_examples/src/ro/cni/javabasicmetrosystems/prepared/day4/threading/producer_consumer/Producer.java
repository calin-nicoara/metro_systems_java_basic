package ro.cni.javabasicmetrosystems.prepared.day4.threading.producer_consumer;

import java.util.Random;

class Producer implements Runnable{
    private MessageBroker messageBroker;

    private static String[] info = {
      "Info 1", "Info 2", "Info 3", "Info 4", "Info 5", "Info 6", "Info 7"
    };

    Producer(final MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < info.length; i++) {
            messageBroker.putMessage(info[i]);
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) { }
        }

        messageBroker.putMessage("END");
    }
}
