import java.io.Serializable;
import java.util.List;

public class Box<T extends Number & Comparable<T> & Serializable> {

    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double avr() {
        double result = 0;
        for (T element : array) {

            result += ((Number) element).doubleValue();
        }
        return result / (double) array.length;
    }

//    public static void method(List<Number> numbers) {
//
//    }

    public static void method(List<? extends Number> numbers) {

    }

    public static <U> U getFirstElement(List<U> list) {
        return list.get(0);
    }

    public int compare(Box<?> anothers) {
        if (avr() > anothers.avr()) {
            return 1;
        } else if (avr() == anothers.avr()) {
            return 0;
        }
        return -1;
    }

    public void setArray(T[] array) {
        this.array = array;
    }


}
