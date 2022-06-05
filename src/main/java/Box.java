public class Box<T> {

    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double avr() {
        double result = 0;
        for (T element: array) {
            result += ((Number) element).doubleValue();
        }
        return result / (double) array.length;
    }

    public void setArray(T[] array) {
        this.array = array;
    }


}
