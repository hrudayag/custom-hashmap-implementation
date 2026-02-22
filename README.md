# Custom HashMap Implementation

This project is a simplified implementation of a HashMap built from scratch in Java to understand how hashing works internally.

Instead of using Java’s built-in HashMap directly, this project recreates the core logic to understand what happens behind the scenes.

---

## Objectives

- Understand how hash functions determine bucket index
- Handle collisions using separate chaining (Linked List)
- Implement dynamic resizing based on load factor
- Use custom objects as keys
- Properly override `equals()` and `hashCode()`

---

## Features

- Generic `CustomHashMap<K, V>`
- Collision handling with linked list chaining
- Automatic resizing
- Custom key class (`Student`)
- Demonstrates logical equality vs reference equality
