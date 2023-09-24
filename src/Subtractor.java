import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Value value;

    Subtractor(Value value){
        this.value = value;
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

            value.subtract(i);
        }
    }
}
