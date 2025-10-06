import java.util.*;

public class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;
    private final Deque<K> order;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.order = new LinkedList<>();
    }

    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        // Refresh recently used key
        order.remove(key);
        order.addFirst(key);
        return cache.get(key);
    }

    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            // Update value & refresh usage
            cache.put(key, value);
            order.remove(key);
            order.addFirst(key);
            return;
        }

        if (cache.size() == capacity) {
            // Evict least recently used
            K leastUsed = order.removeLast();
            cache.remove(leastUsed);
        }

        cache.put(key, value);
        order.addFirst(key);
    }

    public void display() {
        System.out.println("Cache state: " + order);
    }
}
