public class NewQueue {
    private Element firstElement;
    private Element lastElement;
    private int size;

    public NewQueue() {
        this.size = 0;
    }

    public NewQueue enqueue(Object obj) {

        Element newElement = new Element(obj);

        if (firstElement == null) {
            firstElement = newElement;
            lastElement = firstElement;
        }

        if (size == 1) {
            firstElement.setNextElement(newElement);
        } else {
            lastElement.setNextElement(newElement);
        }

        lastElement = newElement;

        size++;
        return this;
    }

    public Object dequeue() {
        Object forReturn = firstElement.getValue();
        firstElement = firstElement.getNextElement();
        size--;

        return forReturn;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Element {
        private Object value;
        private Element nextElement;

        private Element(Object obj) {
            this.value = obj;
        }

        public Object getValue() {
            return value;
        }

        public Element getNextElement() {
            return nextElement;
        }

        public void setNextElement(Element nextElement) {
            this.nextElement = nextElement;
        }
    }
}
