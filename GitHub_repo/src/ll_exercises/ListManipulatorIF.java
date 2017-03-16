package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;

/**
 *
 * @author marin
 */
public interface ListManipulatorIF<E extends Comparable <E>> {

    /**
     * Determines the number of elements contained in a list.
     * HINT: use an iterator.
     * @param l  the list to analyze
     * @return  the number of elements in l
     */
    public int size(SingleLinkedListIF l);

    /**
     * Checks whether two lists contain the same elements in the same order.
     * HINT: use iterators.
     * @param l1  the first list to compare
     * @param l2  the second list to compare
     * @return  true of l1 and l2 are the same, false otherwise
     */
    public boolean sameSame(SingleLinkedListIF l1, SingleLinkedListIF l2);    

    /**
     * Checks whether a list is a sublist of another list.
     * An empty list IS a sublist of any list.
     * @param l1  the potential sublist
     * @param l2  the considered list
     * @return true if l1 is a sublist of l2
     */
    public boolean sublist(SingleLinkedListIF<E> l1, SingleLinkedListIF<E> l2);
    
    /**
     * Removes the first element from a list and inserts it as the first
     * element of another list.
     * @param l1  the list whose first element gets removed
     * @param l2  the fed list
     */
    public void feed(SingleLinkedListIF l1, SingleLinkedListIF l2)
                        throws NoSuchElementException;
    
    /**
     * Removes several first elements from a list and inserts them as the first
     * elements of another list in the original order.
     * @param l1  the list whose first element gets removed
     * @param l2  the fed list
     * @param n  the number of elements to pass on
     */
    public void superFeed(SingleLinkedListIF l1, SingleLinkedListIF l2, int n)
                        throws NoSuchElementException;
    
    /**
     * Determines which elements of a list are not contained in another list.
     * @param l1  the list of elements to check
     * @param l2  the list to scan
     * @return  the list of elements from l1 that do not belong to l2
     */
    public SingleLinkedListIF diff(SingleLinkedListIF l1, 
                                    SingleLinkedListIF l2);
    
    /**
     * Removes every element of a list from another list.
     * The removal extends to duplicates; every element which appears at least
     * once in the source list gets entirely removed from the shrunken list.
     * @param l1  the (source) list of elements to remove
     * @param l2  the shrunken list
     * @return  the number of removed elements
     */
    public int delDiff(SingleLinkedListIF l1, SingleLinkedListIF l2);
    
}
