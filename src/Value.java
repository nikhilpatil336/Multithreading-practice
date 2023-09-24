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

    public void add(int i)
    {
        value += i;
    }

    public void subtract(int i)
    {
        value -= i;
    }
}
