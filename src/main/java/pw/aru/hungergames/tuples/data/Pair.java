package pw.aru.hungergames.tuples.data;

import pw.aru.hungergames.tuples.TupleParser;

import java.util.Map;

/**
 * Represents a name-value pair.
 *
 * @see TupleParser
 * @see Obj
 * @see javafx.util.Pair
 */
public class Pair extends javafx.util.Pair<String, Obj> implements Obj, Map.Entry<String, Obj> {
    /**
     * Creates a new pair
     *
     * @param key   The key for this pair
     * @param value The value to use for this pair
     */
    public Pair(String key, Obj value) {
        super(key, value);
    }

    @Override
    public Obj setValue(Obj ignored) {
        throw new UnsupportedOperationException("setValue");
    }
}
