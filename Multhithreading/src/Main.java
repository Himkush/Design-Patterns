import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    public static void main(String[] args) {
//        Thread getTime =new GetTime20();
//        Runnable getMail = new GetTheMail(10);
//        Runnable getMailAgain = new GetTheMail(20);
//
//        getTime.start();
//        new Thread(getMail).start();
//        new Thread(getMailAgain).start();

        addThreadsToPool();

    }

    private static void addThreadsToPool() {
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
        eventPool.scheduleAtFixedRate(new CheckSystemTime(),0,2, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformCheckSystem("Mail"),5,5,SECONDS);
        eventPool.scheduleAtFixedRate(new PerformCheckSystem("Caleender"),0,2,SECONDS);

        System.out.println("Number of Threads" + Thread.activeCount());

        Thread[] listOFThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOFThreads);
        for(Thread t: listOFThreads ){
            System.out.println(t.getName());
        }

    }

}
