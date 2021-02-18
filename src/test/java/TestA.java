import add_sub.Add;
import add_sub.Sub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA {

    Add a1 = new Add();
    Sub s = new Sub();

    @Test
    @DisplayName("Add two integers")
    public void intAdd() {
        assertEquals(12,a1.add1(4,8),"Test Passed");
        assertEquals(2,a1.add3(1,1),"msg");
        assertEquals(3,a1.add3(2,1),"msg");

    }
    @Test
    @DisplayName("Add two floats")
    public void floatAdd() {
        assertEquals(12.0,a1.addWithFloat(4,8),"Test Passed");

    }

    @Test
    @DisplayName("subtract two integers")
    public void intSub() {
        assertEquals(2,s.sub1(4, 2),"Test Passed");

    }


    @DisplayName("subtract two floats")
    public void floatSub() {
        assertEquals(1,s.subWithFloat(4.7f, 3.4f),"Test Passed");

    }
}
