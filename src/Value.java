public class Value {
    private int value;

    Value(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void add(int i)
    {
        value += i;
    }

    public synchronized void subtract(int i)
    {
        value -= i;
    }
}
