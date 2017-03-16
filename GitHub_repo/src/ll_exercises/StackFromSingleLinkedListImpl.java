package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;

public class StackFromSingleLinkedListImpl<E> implements StackFromSingleLinkedListIF<E> {

    SingleLinkedListIF<E> list;

    public StackFromSingleLinkedListImpl() {
        list = new SingleLinkedListImpl();
    }

    @Override
    public void push(E element) {
        //TODO
        list.insertFirst(element);
    }

    @Override
    public E pop() throws NoSuchElementException {
        //TODO
        E deletedData = list.removeFirst();
        return deletedData;
    }

    @Override
    public boolean isEmpty() {
        //TODO
        return list.isEmpty();
    }

    @Override
    public void display() {
        //TODO
        list.display();
    }
    
}
