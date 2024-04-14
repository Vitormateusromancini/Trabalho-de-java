public interface Mapa<KeyType, ValueType> {
    void put(KeyType key, ValueType value);
    ValueType get(KeyType key);
    boolean containsKey(KeyType key);
    boolean remove(KeyType key);
    int size();
}
