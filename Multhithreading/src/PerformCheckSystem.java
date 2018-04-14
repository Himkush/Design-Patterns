import java.util.concurrent.locks.ReentrantLock;

public class PerformCheckSystem implements Runnable {

    private String checkWhat;

    ReentrantLock lock = new ReentrantLock();

    public PerformCheckSystem(String checkWhat){
        this.checkWhat = checkWhat;

    }

    @Override
    synchronized public void run() {
        System.out.println("Checking"+this.checkWhat);

    }
}
