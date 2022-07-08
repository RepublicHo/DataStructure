package HashingTut;

/**
 * @Author Anthony Z.
 * @Date 7/7/2022
 * @Description:
 */
public class Entry<K, V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
