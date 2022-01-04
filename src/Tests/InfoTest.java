package Tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfoTest {

    @Test
    public void getId() {
        Info info1 = new Info();
        info1.setId(10);
        assertEquals(10, info1.getId());
    }


    @Test
    public void getName() {
        Info info1 = new Info();
        info1.setName("Name");
        assertEquals("Name", info1.getName());
    }

    @Test
    public void setName() {
        Info info1 = new Info();
        info1.setId(10);
        assertEquals(10, info1.getId());
    }

    @Test
    public void getCity() {
    }

    @Test
    public void setCity() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }
}