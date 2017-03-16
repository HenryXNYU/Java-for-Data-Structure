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
        dll.insertFirst(element);
    }

    @Override
    public E removeLeft() throws NoSuchElementException {
        //TODO
        E deletedData = dll.removeFirst();
        return deletedData;
    }

    @Override
    public void insertRight(E element) {
        //TODO
        dll.insertLast(element);
    }

    @Override
    public E removeRight() throws NoSuchElementException {
        //TODO
        E deletedData = dll.removeLast();
        return deletedData;
    }

    @Override
    public boolean isEmpty() {
        //TODO
        return dll.isEmpty();
    }

    @Override
    public void display() {
        //TODO
        dll.display();
    }
}
