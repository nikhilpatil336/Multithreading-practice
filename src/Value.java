import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    private AtomicInteger value;

    Value(AtomicInteger value)
    {
        this.value = value;
    }

    public AtomicInteger getValue() {
        return value;
    }

    public void setValue(AtomicInteger value) {
        this.value = value;
    }

    public void add(int i)
    {
        value.addAndGet(i);
    }

    public void subtract(int i)
    {
       value.addAndGet(-i);
    }
}
