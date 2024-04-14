public class MapaListaDuplamenteEncadeada<KeyType, ValueType> implements Mapa<KeyType, ValueType> {
    private static class Node<KeyType, ValueType> {
        KeyType key;
        ValueType value;
        Node<KeyType, ValueType> next;
        Node<KeyType, ValueType> prev;

        Node(KeyType key, ValueType value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<KeyType, ValueType> head;
    private Node<KeyType, ValueType> tail;
    private int size;

    public MapaListaDuplamenteEncadeada() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void put(KeyType key, ValueType value) {
        Node<KeyType, ValueType> newNode = new Node<>(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public ValueType get(KeyType key) {
        Node<KeyType, ValueType> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(KeyType key) {
        Node<KeyType, ValueType> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(KeyType key) {
        Node<KeyType, ValueType> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                if (current == head) {
                    head = head.next;
                }
                if (current == tail) {
                    tail = tail.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean contemCarroFord() {
        for (Node<KeyType, ValueType> node = head; node != null; node = node.next) {
            if (node.value instanceof Veiculo) {
                Veiculo veiculo = (Veiculo) node.value;
                if (veiculo.isMarcaFord()) {
                    return true;
                }
            }
        }
        return false;
    }
}
