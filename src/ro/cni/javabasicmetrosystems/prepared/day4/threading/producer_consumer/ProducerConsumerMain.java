package ro.cni.javabasicmetrosystems.prepared.day4.threading.producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        MessageBroker messageBroker = new MessageBroker();

        new Thread(new Producer(messageBroker)).start();
        new Thread(new Consumer(messageBroker)).start();
    }
}
