import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewStackTest {

    NewStack stack = new NewStack();

    @Before
    public void setUp() throws Exception {
        stack.push(5)
                .push(60)
                .push(1)
                .push(6)
                .push(30);
    }

    @Test
    public void pop() {
        assertEquals(30, stack.pop());
        assertEquals(6, stack.pop());
    }

    @Test
    public void getSize() {
        assertEquals(5, stack.getSize());
    }

    @Test
    public void isEmpty() {
        assertFalse(stack.isEmpty());
    }
}