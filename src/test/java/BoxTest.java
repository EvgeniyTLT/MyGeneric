import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoxTest {


    @Test
    public void testBox() {
        List<Integer> numbers = new ArrayList<>();
        Box.method(numbers);
    }

    @Test
    public void transfer() {

        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Box.transfer(list, list2);
        assertEquals(0, list.size());
        assertEquals(10, list2.size());


    }
}