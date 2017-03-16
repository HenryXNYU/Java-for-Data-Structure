/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.NoSuchElementException;


public class DoubleLinkedListImpl<E extends Comparable<E>> 
                            implements DoubleLinkedListIF<E> {

    public DoubleLinkNode<E> head = new DoubleLinkNode();
    public DoubleLinkNode<E> tail = new DoubleLinkNode();
    public int size;

    public DoubleLinkedListImpl() {
        head.setNext(null);
        tail.setPrevious(null);
    }

    @Override
    public boolean isEmpty() {
        //TODO
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void insertFirst(E e) {
        //TODO
        DoubleLinkNode<E> newNode = new DoubleLinkNode<>(e);
        DoubleLinkNode<E> originFirstNode = head.getNext();
        if (isEmpty()) {
            newNode.setNext(null);
            newNode.setPrevious(head);
            head.setNext(newNode);
            tail.setPrevious(newNode);
            size++;
        }else{
            newNode.setNext(originFirstNode);
            newNode.setPrevious(head);
            originFirstNode.setPrevious(newNode);
            head.setNext(newNode);
            size++;
        }
    }

    @Override
    public void insertLast(E e) {
        //TODO
        DoubleLinkNode<E> newNode = new DoubleLinkNode<>(e);
        DoubleLinkNode<E> preNode = tail.getPrevious();
        if (isEmpty()) {
            insertFirst(e);
        }else{
            preNode.setNext(newNode);
            newNode.setPrevious(preNode);
            newNode.setNext(null);
            tail.setPrevious(newNode);
            size++;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        //TODO
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        DoubleLinkNode<E> firstNode = head.getNext();
        E firstData = firstNode.getData();
        if (firstNode.getNext() == null){
            head.setNext(null);
            tail.setNext(null);
            size--;
            return firstData;
        }else{
            DoubleLinkNode secondNode = firstNode.getNext();
            head.setNext(secondNode);
            secondNode.setPrevious(head);
            size--;
            return firstData;
        }
    }

    @Override
    public E removeLast() throws NoSuchElementException {
        //TODO
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        DoubleLinkNode<E> lastNode = tail.getPrevious();
        E lastData = lastNode.getData();
        if (lastNode.getPrevious() == null) {
            head.setNext(null);
            tail.setPrevious(null);
            size--;
            return lastData;
        }else{
            DoubleLinkNode secondLast = lastNode.getPrevious();
            secondLast.setNext(null);
            tail.setPrevious(secondLast);
            size--;
            return lastData;
        }
    }

    @Override
    public boolean contains(E e) {
        //TODO
        if (isEmpty()) {
            System.out.println("it's currently empty");
            return false;
        }else{
            DoubleLinkNode<E> currentNode = head.getNext();
            for (int i = 0; i < size; i++) {
                E currentData = currentNode.getData();
                if (currentData.compareTo(e)==0) {
                    return true;
                }
            }return false;
        }
    }

    @Override
    public void display() {
        //TODO
        if (isEmpty()) {
            System.out.println("the list is currently empty");
            return;
        }
        DoubleLinkNode currentNode = head.getNext();
        System.out.println("this is the forward list");
        for(int i = 0;i < size; i++){
            E currentData = (E) currentNode.getData();
            System.out.print(currentData);
            System.out.print(" "); 
            currentNode = currentNode.getNext();
        }
        System.out.println(" ");
    }

    @Override
    public void displayBackwards() {
        //TODO
        if (isEmpty()) {
            System.out.println("the list is currently empty");
            return;
        }
        DoubleLinkNode currentNode = tail.getPrevious();
        System.out.println("this is the backward list");
        for(int i = 0;i < size; i++){
            E currentData = (E) currentNode.getData();
            System.out.print(currentData);
            System.out.print(" ");
            currentNode = currentNode.getPrevious();
        }
        System.out.println(" ");
    }
}
