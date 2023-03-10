package ch13.exercise.q3;

public class Container<K, V> {
    private K Key;
    private V value;

    public void set(K key, V value) {
        this.Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return value;
    }
}
