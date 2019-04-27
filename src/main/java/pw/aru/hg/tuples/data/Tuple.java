package pw.aru.hg.tuples.data;

import pw.aru.hg.tuples.TupleParser;

import java.util.List;

/**
 * Represents a {@link List} of {@link Obj}s.
 *
 * @see TupleParser
 * @see Obj
 * @see List
 */
public interface Tuple extends Obj, List<Obj> {
    /**
     * Returns <tt>true</tt> if this tuple contains either a pair for the specified key
     * or a {@link Text} element whose value is the specified element.
     *
     * @param value key whose presence in this tuple is to be tested
     * @return <tt>true</tt> if this tuple contains a mapping for the specified key
     */
    default boolean containsAny(String value) {
        for (Obj obj : this) {
            if (obj.isPair() && obj.asPair().getKey().equals(value)) {
                return true;
            } else if (obj.isText() && obj.asText().equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this tuple contains a pair for the specified key.
     *
     * @param key key whose presence in this tuple is to be tested
     * @return <tt>true</tt> if this tuple contains a mapping for the specified key
     */
    default boolean containsPair(String key) {
        for (Obj obj : this) {
            if (obj.isPair() && obj.asPair().getKey().equals(key)) return true;
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this tuple contains a {@link Text} element whose value is the specified element.
     *
     * @param text value whose presence in this tuple is to be tested
     * @return <tt>true</tt> if this tuple contains a {@link Text} element whose value is the specified element
     */
    default boolean containsText(String text) {
        for (Obj obj : this) {
            if (obj.isText() && obj.asText().equals(text)) return true;
        }
        return false;
    }

    /**
     * Returns the first element in this tuple.
     *
     * @return the first element in this tuple, or null, if none.
     */
    default Obj firstArg() {
        if (isEmpty()) return null;
        return get(0);
    }

    /**
     * Returns the value to which the specified key is paired or {@code null} if this tuple contains no pair for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is paired, or {@code null} if this map contains no mapping for the key
     */
    default Obj get(String key) {
        for (Obj obj : this) {
            if (!obj.isPair()) continue;

            Pair pair = obj.asPair();
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    /**
     * Returns <tt>true</tt> if this tuple contains exactly one element.
     *
     * @return <tt>true</tt> if this tuple contains exactly one element.
     */
    default boolean isSingleton() {
        return size() == 1;
    }
}
