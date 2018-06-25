public class NewStack {

    Element lastElement;
    int size;

    public  NewStack(){
        this.size = 0;
    }

    public NewStack push(Object obj){
        Element newElement = new Element(obj);
        newElement.setPreviousElement(lastElement);
        lastElement = newElement;
        this.size++;
        return this;
    }

    public Object pop(){
        Object forReturn  = lastElement.getValue();
        lastElement = lastElement.getPreviousElement();
        size--;
        return forReturn;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private class Element{
        private Object value;
        private Element previousElement;

        private Element(Object obj){
            this.value = obj;
        }

        public Object getValue() {
            return value;
        }

        public Element getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Element previousElement) {
            this.previousElement = previousElement;
        }
    }
}
