import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {
       Box <String, Integer, Float> box1 = new Box("String", 20, 20.1f);
       Box <String, Integer, Float> box2 = new Box("String", 30, 30.1f);
       float result = box1.getValue()+box1.getuValue()+box2.getValue()+box2.getuValue();
       assertEquals(100.2, result, 0.1);
    }
}