

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 100; i++)
        {
            Value v1 = new Value(0);

            Thread t1 = new Thread(new Adder(v1));
            Thread t2 = new Thread(new Subtractor(v1));

            t1.start();
            t2.start();

            System.out.println(v1.getValue());
        }
    }
}