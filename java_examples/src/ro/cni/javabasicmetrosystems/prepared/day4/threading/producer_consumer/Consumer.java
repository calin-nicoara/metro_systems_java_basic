package ro.cni.javabasicmetrosystems.prepared.day4.threading.producer_consumer;

import java.util.Random;

class Consumer implements Runnable{
    private MessageBroker messageBroker;

    Consumer(final MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        Random random = new Random();

        String currentMessage = "";
        while(!"END".equals(currentMessage)) {
            currentMessage = messageBroker.takeMessage();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
