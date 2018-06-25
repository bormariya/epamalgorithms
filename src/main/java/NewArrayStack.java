public class NewArrayStack {
    private int size;
    private int indexLastElement;
    Object[] data;

    public int getIndexLastElement() {
        return indexLastElement;
    }

    public NewArrayStack(){
        this(10);
    }

    public NewArrayStack(int size){
        this.size = size;
        indexLastElement = -1;
        data = new Object[size];
    }

    public NewArrayStack push(Object obj){
        indexLastElement++;
        if(indexLastElement + 1 > size){
            size *= 2;
            Object[] newData = new Object[size];
            System.arraycopy(data, 0, newData, 0, size/2);
            data = newData;
            newData = null;
        }

        data[indexLastElement] = obj;
        return this;
    }



    public Object pop(){
        Object forReturn = data[indexLastElement];
        data[indexLastElement] = null;
        indexLastElement--;
        return  forReturn;
    }

    /**
     * @return real count of elements in the stack
     */
    public int getElementsCount(){
        return indexLastElement + 1;
    }

    /**
     * @return size of dynamical stack array
     */
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return indexLastElement == -1;
    }

}
