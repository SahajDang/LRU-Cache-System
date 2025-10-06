# LRU Cache System (Java)

## Project Overview
This project implements a **generic in-memory LRU (Least Recently Used) Cache** in Java.  
The cache supports efficient `get` and `put` operations with **O(1) time complexity** using a combination of a **HashMap** and a **Doubly Linked List**.  

This project demonstrates core concepts of **data structures, memory management, and system-level performance optimizations**. It also provides a foundation for exploring concurrency and advanced cache eviction policies.

---

## Features
- **LRU Eviction Policy**: Automatically removes the least recently used entry when capacity is exceeded.  
- **Configurable Capacity**: Maximum number of entries can be set during initialization.  
- **Interactive Demo**: Simple `Main.java` file to test cache operations.  
- **Extensible Design**: Can be extended to support memory-based constraints or alternative eviction strategies (e.g., LFU).  

---

## Tech Stack
- Java (Collections Framework, OOP)  
- Core Data Structures: HashMap, Doubly Linked List  
- Concepts: Caching, System Performance, Algorithms  

---

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/SahajDang/LRU-Cache-System.git
cd LRU-Cache-System
```

### 2. Compile the Java Files
```bash
javac LRUCache.java Main.java
```

### 3. Run the Demo
```bash
java Main
```
You should see cache operations and the state of the cache after each operation.

## Usage Example

```bash
LRUCache<Integer, String> cache = new LRUCache<>(3);
cache.put(1, "One");
cache.put(2, "Two");
cache.put(3, "Three");
cache.display(); // [3, 2, 1]

cache.get(1);
cache.display(); // [1, 3, 2]

cache.put(4, "Four");
cache.display(); // [4, 1, 3] (2 evicted)
```

## Future Extensions

- Implement memory-based eviction (limit cache size by memory usage).
- Support thread-safe operations for concurrency.
- Add other eviction policies such as LFU or FIFO.

## Author

Sahaj Dang

GitHub: https://github.com/SahajDang
