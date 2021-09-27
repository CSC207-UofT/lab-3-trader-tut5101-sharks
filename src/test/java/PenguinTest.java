/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class PenguinTest {
    public Penguin p;

    @Before
    public void setup() throws Exception {
        p = new Penguin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("noot noot!", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(120, p.getPrice());
    }
}
