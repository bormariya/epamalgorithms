public class NewQueueWithStacks {
    private NewStack firstStack;
    private NewStack secondStack;

    public NewQueueWithStacks(){
        firstStack = new NewStack();
        secondStack = new NewStack();
    }

    public NewQueueWithStacks enqueue(Object obj){
        if(firstStack.isEmpty()){
            shift(secondStack, firstStack);
        }

        firstStack.push(obj);

        return this;
    }

    public Object dequeue(){

        if(!firstStack.isEmpty()) {
            shift(firstStack, secondStack);
            return secondStack.pop();
        } else {
            return secondStack.pop();
        }
    }

    public int getSize(){
        if(!firstStack.isEmpty())
            return firstStack.getSize();
        else
            return secondStack.getSize();
    }

    public boolean isEmpty(){
        return (firstStack.isEmpty() && secondStack.isEmpty());
    }

    private void shift(NewStack from, NewStack to){
        int count = from.getSize();
        for (int i = 0; i < count; i++) {
            to.push(from.pop());
        }
    }
}
