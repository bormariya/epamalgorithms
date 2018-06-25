import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewArrayStackTest {
    NewArrayStack arrayStack;

    @Before
    public void init(){
        arrayStack = new NewArrayStack(9);
        arrayStack.push(5)
                .push(60)
                .push(1)
                .push(6)
                .push(30);
    }

    @Test
    public void pop() {
        assertEquals(30, arrayStack.pop());
        assertEquals(6, arrayStack.pop());
        assertEquals(3, arrayStack.getElementsCount());
        assertEquals(2, arrayStack.getIndexLastElement());
    }

    @Test
    public void getElementsCount() {
        assertEquals(5, arrayStack.getElementsCount());
    }

    @Test
    public void getSize() {
        assertEquals(9, arrayStack.getSize());

        arrayStack.push(34)
                .push(34)
                .push(34)
                .push(34)
                .push(34)
                .push(34)
                .push(34)
                .push(34);

        assertEquals(13, arrayStack.getElementsCount());
        assertEquals(18, arrayStack.getSize());

    }

    @Test
    public void isEmpty() {
        assertFalse(arrayStack.isEmpty());
    }
}