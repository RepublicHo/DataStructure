package HashingTut;

import java.util.Iterator;

/**
 * @Author Anthony Z.
 * @Date 7/7/2022
 * @Description: An interface for dictionary with distinct search keys.
 * Search keys and associated values are not null.
 */
public interface DictionaryInterface<K, V>{

    V add(K key, V value);
    V remove(K key);
    V getValue(K key);
    boolean contains(K key);
    Iterator<K> getKeyIterator();
    Iterator<V> getValueIterator();
    boolean isEmpty();
    int getSize();
    void clear();

}
