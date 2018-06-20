import lombok.Getter;
import lombok.Setter;


public class NewLinkedList {

    public NewLinkedList() {
        size = 0;
    }

    @Getter
    private int size;

    private Element head;
    private Element tail;

    public Object getHead() {
        return head.getValue();
    }

    public Object getTail() {
        return tail.getValue();
    }

    public NewLinkedList addElement(Object obj){
        Element element = new Element(obj);

        if(this.isEmpty()){
            head = element;
            tail = element;
        }

        element.setPreviousElement(tail);
        element.setNextElement(head);
        tail = element;
        size++;

        return this;
    }

    private boolean isEmpty(){
        return (head == null && tail == null);
    }

    @Getter
    @Setter
    private static class Element{
        private Element(Object obj){
            this.value = obj;
        }
        private Element previousElement;
        private Element nextElement;
        private Object value;

    }
}
