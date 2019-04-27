package pw.aru.hg.tuples.data;

import java.util.LinkedList;

/**
 * Default implementation of a {@link Tuple}, backed by a {@link LinkedList}
 */
public class LinkedTuple extends LinkedList<Obj> implements Tuple {

    /**
     * Constructs a list containing the specified object as the first element.
     *
     * @param firstValue the first value of the list
     */
    public LinkedTuple(Obj firstValue) {
        add(firstValue);
    }

    /**
     * Constructs an empty list.
     */
    public LinkedTuple() {
        super();
    }
}
