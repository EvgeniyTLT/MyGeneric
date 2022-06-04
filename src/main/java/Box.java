public class Box <K, V, U> {
    private K key;
    private V value;
    private U uValue;

    public Box(K key, V value, U uValue) {
        this.key = key;
        this.value = value;
        this.uValue = uValue;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public U getuValue() {
        return uValue;
    }

    public void setuValue(U uValue) {
        this.uValue = uValue;
    }
}
