import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewQueueWithStacksTest {

    NewQueueWithStacks queueWithStacks;

    @Before
    public void init(){
        queueWithStacks = new NewQueueWithStacks();
        queueWithStacks.enqueue(5)
                .enqueue(4)
                .enqueue(6)
                .enqueue(34)
                .enqueue(-3)
                .enqueue(1);
    }

    @Test
    public void dequeue() {
        assertEquals(5, queueWithStacks.dequeue());
        assertEquals(4, queueWithStacks.dequeue());
    }

    @Test
    public void enqueue() {

        queueWithStacks.enqueue(-100500);
        assertEquals(5, queueWithStacks.dequeue());
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        assertEquals(-100500, queueWithStacks.dequeue());
        assertTrue(queueWithStacks.isEmpty());

    }

    @Test
    public void getSize() {
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        assertEquals(4, queueWithStacks.getSize());
    }

    @Test
    public void isEmpty() {

        assertFalse(queueWithStacks.isEmpty());

        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();
        queueWithStacks.dequeue();

        assertTrue(queueWithStacks.isEmpty());
    }
}