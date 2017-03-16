package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;


public class DequeFromDoubleLinkedListImpl<E extends Comparable<E>> 
                                implements DequeFromDoubleLinkedListIF<E> {

    DoubleLinkedListIF<E> dll;

    public DequeFromDoubleLinkedListImpl() {
        dll = new DoubleLinkedListImpl();
    }

    @Override
    public void insertLeft(E element) {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E removeLeft() throws NoSuchElementException {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insertRight(E element) {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E removeRight() throws NoSuchElementException {
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
