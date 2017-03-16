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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E pop() throws NoSuchElementException {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
