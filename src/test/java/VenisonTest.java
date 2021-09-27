import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VenisonTest {
    Venison v;

    @Before
    public void setUp() throws Exception {
        v = new Venison(50, 15, "deer");
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(40 - 15*(1/50), v.getPrice());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("This is the meat of a deer", v.toString());
    }
}
