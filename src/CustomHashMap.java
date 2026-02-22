class CustomHashMap<K, V> {
    private int capacity = 16;
    private float loadFactor = 0.75f;
    private int size = 0;

    private Node<K, V>[] buckets;

    public CustomHashMap() {
        buckets = new Node[capacity];
    }

    private int getIndex(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        //check if key exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        //insert new node
        size++;
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

        if ((float) size / capacity > loadFactor) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    private void resize() {
        capacity *= 2;
        Node<K, V>[] oldBuckets = buckets;
        buckets = new Node[capacity];
        size = 0;

        for (Node<K, V> node : oldBuckets) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }
    }

    public int size() {
        return size;
    }
}