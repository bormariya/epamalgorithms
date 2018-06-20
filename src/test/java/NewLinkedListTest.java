import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewLinkedListTest {

    NewLinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new NewLinkedList();
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
    }

    @Test
    public void getSize() {
        assertEquals(3, linkedList.getSize());
    }

    @Test
    public void getHead() {
        assertEquals(1, linkedList.getHead());
    }

    @Test
    public void getTail() {
        assertEquals(3, linkedList.getTail());
    }
}