package pw.aru.hg.tuples.data;

import pw.aru.hg.tuples.TupleParser;

/**
 * Represents a {@link String}.
 *
 * @see TupleParser
 * @see Obj
 * @see String
 */
public class Text implements Obj {
    private final String value;

    /**
     * Creates a new object
     *
     * @param value The value of this object
     */
    public Text(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * Returns the value of this object.
     *
     * @return The value of this object
     */
    public String value() {
        return value;
    }
}
