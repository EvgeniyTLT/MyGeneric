import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {
        Box box1 = new Box(10);
        Box box2 = new Box(20);
        box2.setObject("fdsfds");
        int n1 = 0;
        int n2 = 0;
        int expected = 30;
        int result = (int) box1.getObject() + (int) box2.getObject();
        assertEquals(expected, result);

    }
}