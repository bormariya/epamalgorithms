import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewLinkedListTest {

    NewLinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new NewLinkedList();
        linkedList.addElement(1)
                .addElement(2)
                .addElement(5)
                .addElement(3);
    }

    @Test
    public void getSize() {
        assertEquals(4, linkedList.getSize());
    }

    @Test
    public void getHead() {
        assertEquals(1, linkedList.getHead());
    }

    @Test
    public void getTail() {
        assertEquals(3, linkedList.getTail());
    }

    @Test
    public void get() {
        assertEquals(5, linkedList.get(3));
    }

    @Test
    public void delete() {
        linkedList.delete(5);
        assertEquals(3, linkedList.get(3));
    }
}