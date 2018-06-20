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
//            head.setNextElement(tail);
//            head.setPreviousElement(tail);
            tail = element;
//            tail.setNextElement(head);
//            tail.setPreviousElement(head);
        }

        element.setPreviousElement(tail);
        element.setNextElement(head);

        if(this.size == 1){
            head.setNextElement(element);
        }

        tail = element;
        head.setPreviousElement(tail);
        size++;

        return this;
    }

    public Object get(int index){
        Element tempElement = head;
        for(int i = 0; i < index - 1; i++){
            tempElement = tempElement.nextElement;
        }

        return tempElement.getValue();
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
