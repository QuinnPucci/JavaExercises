public class ThreeMethV2 {
    private final Object criticalObj1 = new Object();
    private final Object criticalObj2 = new Object();
    private final Object criticalObj3 = new Object();

    // Notice the different output from ThreeMeth
    // This is the big concurrency rule:
    //
    // Threads do not block each other just because they are threads.
    // They block each other when they compete for the same lock.


    void a(){
        synchronized (criticalObj1){
            System.out.println("Entering Method A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Leaving Method A");
        }
    }

    void b(){
        synchronized (criticalObj2){
            System.out.println("Entering Method B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Leaving Method B");
        }
    }

    void c(){
        synchronized (criticalObj3){
            System.out.println("Entering Method C");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Leaving Method C");
        }
    }

    public static void main(String[] args){
        final ThreeMethV2 tester = new ThreeMethV2();

        new Thread(() -> tester.a()).start();
        // Create a new thread whose job is to call tester.b(), then start it.
        // -> = “goes to” or “produces this behavior”
        new Thread(() -> tester.b()).start();
        new Thread(() -> tester.c()).start();
    }
}
