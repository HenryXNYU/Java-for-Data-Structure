package linkedlists;

import java.util.NoSuchElementException;

public class SortedListImpl<E extends Comparable<E>> implements SortedListIF<E> {

    SingleLinkNode<E> head;

    public SortedListImpl() {
        head = new SingleLinkNode<>();
    }

    @Override
    public void insert(E e) {
        //TODO
        SingleLinkNode<E> currentNode = head.getNext();
        SingleLinkNode<E> preNode = head;
        SingleLinkNode<E> newNode = new SingleLinkNode<>(e);
        E currentData = currentNode.getData();
        if (currentNode==null) {
            preNode.setNext(newNode);
            return;
        }
        else if (e.compareTo(currentData) <= 0) {
            preNode.setNext(newNode);
            newNode.setNext(currentNode);
            return;
        }
        else if (e.compareTo(currentData) > 0){
            preNode = currentNode;
            currentNode = currentNode.getNext();
            return;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
