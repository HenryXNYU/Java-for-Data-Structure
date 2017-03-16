/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class SingleLinkedListImpl<E extends Comparable <E>> 
                                    implements SingleLinkedListIF<E>{

    public SingleLinkNode<E> head;

    public SingleLinkedListImpl() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void insertFirst(E e) {
        SingleLinkNode<E> node = new SingleLinkNode(e);
        node.setNext(head);
        head = node;
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if ( isEmpty() )
            throw new NoSuchElementException();
        SingleLinkNode<E> node = head;
        head = node.getNext();
        return node.getData();
    }

    @Override
    public int find(E e) {
        Iterator<E> iter = iterator();
        int i = 0;
        while ( iter.hasNext() ) {
            if ( e.compareTo( iter.next() ) != 0) 
                i++;
            else 
                return i;
        }
        return -1;
    }

    @Override
    public E delete(E e) {
        E result = null;

        // Find the position of the link that holds the element to remove
        int position = find(e);
        if (position == 0) { // If we need to remove the first element...
            try {
                result = removeFirst();
            }
            catch (NoSuchElementException ex) {
                System.out.println("Tried a delete from an empty SLL");
                System.exit(1);
            }
        } 
        else if (position != -1) { // The list needs to contain the element...
            SingleLinkNode n = head;
            // Get the predecessor of the link to remove
            for (int i = 0; i < position - 1; i++)
                n = n.getNext();
            // Save the data we need to return; hard cast required
            result = (E) n.getNext().getData();
            // Make the predecessor reference the successor
            n.setNext( n.getNext().getNext() );
        }
        return result;
    }

    @Override
    public void display() {
        Iterator<E> iter = iterator();
        System.out.print("HEAD | ");
        while ( iter.hasNext() )
            System.out.print(iter.next().toString() + " ");
        System.out.println("| TAIL");
    }

    @Override
    public Iterator<E> iterator() {
        return new SingleLinkedListIterator(head);
    }
    
}
