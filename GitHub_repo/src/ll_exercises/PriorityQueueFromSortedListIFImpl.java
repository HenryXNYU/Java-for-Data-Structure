package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;


public class PriorityQueueFromSortedListIFImpl<E extends Comparable<E>> 
                            implements PriorityQueueFromSortedListIF<E> {

    SortedListIF<E> sl;

    public PriorityQueueFromSortedListIFImpl() {
        sl = new SortedListImpl(); 
    }

    @Override
    public void insert(E element) {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove() throws NoSuchElementException {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
