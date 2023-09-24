import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 10; i++)
        {
            Value v1 = new Value(0);

            Lock lock = new ReentrantLock();

            ExecutorService executorService = Executors.newCachedThreadPool();

            executorService.execute(new Adder(v1, lock));
            executorService.execute(new Subtractor(v1, lock));

            executorService.shutdown();
            executorService.awaitTermination(3, TimeUnit.SECONDS);

            System.out.println(v1.getValue());
        }
    }
}