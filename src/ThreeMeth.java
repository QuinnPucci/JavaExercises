public class ThreeMeth {

    // This is the shared lock object.
    // We use a plain Object because we are not storing data in it;
    // its only job is to act as the monitor/lock.
    //
    // All three methods synchronize on this SAME object.
    // That means all three methods must compete for the same lock.
    //
    // Because they use the same lock, only ONE thread at a time
    // can be inside any of these synchronized blocks.
    private final Object criticalObj = new Object();

    void a() {
        // synchronized is the locking mechanism.
        // It means:
        // "A thread must acquire the lock on criticalObj
        // before entering this block."
        //
        // If another thread already holds that lock,
        // this thread must wait.
        synchronized (criticalObj) {
            System.out.println("Entering Method A");

            // The sleep is inside the synchronized block on purpose.
            // That means this thread HOLDS the lock while sleeping.
            //
            // This makes the one-at-a-time behavior easy to see,
            // because the other threads must wait until this block ends.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Leaving Method A");
        }
        // When execution leaves the synchronized block,
        // the lock is automatically released.
    }

    void b() {
        // Method B also uses the SAME lock object.
        // So B cannot run its critical section at the same time as A or C.
        synchronized (criticalObj) {
            System.out.println("Entering Method B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Leaving Method B");
        }
    }

    void c() {
        // Method C also uses the SAME lock object.
        // So A, B, and C are all forced to take turns.
        synchronized (criticalObj) {
            System.out.println("Entering Method C");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Leaving Method C");
        }
    }

    public static void main(String[] args) {
        // One shared object instance.
        // All three threads call methods on THIS SAME object,
        // so they all share the same lock setup.
        final ThreeMeth tester = new ThreeMeth();

        // Create a new thread whose job is to call tester.a(), then start it.
        new Thread(() -> tester.a()).start();

        // () means "this task takes no parameters"
        // -> means "hey thread, runs this code"
        // So this creates a new thread whose work is calling tester.b()
        new Thread(() -> tester.b()).start();

        // Same idea for method c()
        new Thread(() -> tester.c()).start();
    }
}