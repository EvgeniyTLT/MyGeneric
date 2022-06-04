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
        if (box1.getObject() instanceof Integer){
            n1=(int)box1.getObject();
        }
        if (box2.getObject() instanceof Integer){
            n2=(int)box2.getObject();
        }
        int expected = 30;
        int result = n1+n2;
        assertEquals(expected, result);

    }
}