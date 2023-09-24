import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Value value;
    private Lock lock;

    Subtractor(Value value, Lock lock){
        this.value = value;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //System.out.println(value.value);
            try
            {
                Thread.sleep(3);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            lock.lock();
            value.subtract(i);
            lock.unlock();
        }
    }
}
