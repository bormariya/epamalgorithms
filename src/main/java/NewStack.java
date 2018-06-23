public class NewStack {
    Element element;

    private class Element{
        Object value;
        Element nextElement;

        public Object getValue() {
            return value;
        }

        public Element getNextElement() {
            return nextElement;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public void setNextElement(Element nextElement) {
            this.nextElement = nextElement;
        }
    }
}
