package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.DoubleEndedListIF;
import linkedlists.DoubleEndedListImpl;


public class QueueFromDoubleEndedListImpl<E extends Comparable<E>> 
                                implements QueueFromDoubleEndedListIF<E> {

    DoubleEndedListIF<E> del;

    public QueueFromDoubleEndedListImpl() {
        del = new DoubleEndedListImpl();
    }

    @Override
    public void enqueue(E element) {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E dequeue() throws NoSuchElementException {
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
