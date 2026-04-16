public class MiniEvent implements Runnable {

    String eventName;
    long delay;

    public MiniEvent(String eventName, long delay){
        this.eventName = eventName;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread name: "
                + Thread.currentThread().getName()
                + ". Delay: " + delay + ". "
                + eventName + " ran."

        );
    }
}
