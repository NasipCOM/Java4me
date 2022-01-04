package Tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestingTest {

    @Test
    public void subtraction(){
        Testing test1 = new Testing();
        assertEquals(10, test1.subtraction(20, 10));
    }

    @Test
    public void division(){
        Testing test2 = new Testing();
        assertEquals(2, test2.division(10,5));
    }
}