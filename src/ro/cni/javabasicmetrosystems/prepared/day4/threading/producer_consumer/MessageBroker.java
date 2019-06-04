package ro.cni.javabasicmetrosystems.prepared.day4.threading.producer_consumer;

class MessageBroker {

    private String message;
    private boolean empty = true;

    public synchronized void putMessage(String newMessage) {
        while(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }


        message = newMessage;
        empty = false;

        System.out.println("SENT " + newMessage);
        notifyAll();
    }

    public synchronized String takeMessage() {
        while(empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        empty = true;
        notifyAll();

        System.out.println("RECEIVED " + message);
        return message;
    }
}
