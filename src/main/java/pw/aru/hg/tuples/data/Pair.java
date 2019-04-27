package pw.aru.hg.tuples.data;

import pw.aru.hg.tuples.TupleParser;

import java.util.Map;

/**
 * Represents a name-value pair.
 *
 * @see TupleParser
 * @see Obj
 */
public class Pair implements Obj, Map.Entry<String, Obj> {
    private final String key;
    private final Obj value;

    /**
     * Creates a new pair
     *
     * @param key   The key for this pair
     * @param value The value to use for this pair
     */
    public Pair(String key, Obj value) {

        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Obj getValue() {
        return value;
    }

    @Override
    public Obj setValue(Obj ignored) {
        throw new UnsupportedOperationException("setValue");
    }
}
