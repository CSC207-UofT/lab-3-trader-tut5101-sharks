import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest {
    Tiger t;

    @Before
    public void SetUp(){
        t = new Tiger(10, "Asia", 50);
    }

    @Test(timeout = 25)
    public void TestSound(){
        assertEquals("Grr!", t.sound());
    }

    @Test(timeout = 25)
    public void TestGetPrice(){
        assertEquals(500, t.getPrice());
    }
}
