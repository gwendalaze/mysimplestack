package deqo.geyn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item testSubject;

    @Before
    public void setUp() throws Exception {
        testSubject = new Item(5);
    }

    @Test
    public void setValue() {
        testSubject.setValue(1);
        assertEquals(testSubject.getValue(),1);
    }

    @Test
    public void getValue() {
        assertEquals(testSubject.getValue(),5);
    }
}