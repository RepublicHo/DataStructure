package HashingTut;

import java.util.Iterator;

/**
 * @Author Anthony Z.
 * @Date 7/7/2022
 * @Description: Implement the ADT dictionary by using hashing and linear probing
 * to resolve collisions.
 *
 * The dictionary is unsorted and has distinct search keys.
 * Search keys and associated values are not null.
 */
public class HashedDictionary<K, V> implements DictionaryInterface<K, V> {
    // The dictionary
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 5;
    private static final int MAX_CAPACITY = 100;

    // The hash table
    private Entry<K, V> hashTable;
    private int tableSize;


    @Override
    public V add(K key, V value) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public V getValue(K key) {
        return null;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        return null;
    }

    @Override
    public Iterator<V> getValueIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
