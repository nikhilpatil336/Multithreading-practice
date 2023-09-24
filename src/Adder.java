import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Value value;

    Adder(Value value){
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try
            {
                Thread.sleep(3);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            value.add(i);
        }
    }
}
