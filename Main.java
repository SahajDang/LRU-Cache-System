public class Main {
    public static void main(String[] args) {
        LRUCache<Integer, String> lru = new LRUCache<>(3);

        lru.put(1, "One");
        lru.put(2, "Two");
        lru.put(3, "Three");
        lru.display(); // [3, 2, 1]

        lru.get(1); 
        lru.display(); // [1, 3, 2]

        lru.put(4, "Four"); 
        lru.display(); // [4, 1, 3] (2 evicted)

        lru.get(3);
        lru.display(); // [3, 4, 1]
    }
}
