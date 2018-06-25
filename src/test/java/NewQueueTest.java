import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewQueueTest {

    NewQueue queue;

    @Before
    public void init() {
        queue = new NewQueue();
        queue.enqueue(-10)
                .enqueue(3)
                .enqueue(67)
                .enqueue(8)
                .enqueue(2);
    }

    @Test
    public void dequeue() {
        assertEquals(-10, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    public void getSize() {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(2, queue.getSize());

    }

    @Test
    public void isEmpty() {

        assertFalse(queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}