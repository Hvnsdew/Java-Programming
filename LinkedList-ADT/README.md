# 🔗 Custom Singly Linked List ADT (Grocery List Implementation)

A pure Java implementation of an **Abstract Data Type (ADT) Singly Linked List** built from scratch without using Java's built-in collections framework (`java.util.LinkedList`). This project demonstrates manual pointer manipulation, dynamic memory allocation, and edge-case validation.

---

## 📌 Features & Supported Operations

* **Dynamic Resizing**: Memory is allocated on demand via node pointers without fixed capacity constraints.
* **Core ADT Operations**:
  * `addItem(int index, String newItem)`: Inserts an item at a specific position, handling head, intermediate, and tail insertions.
  * `removeItem(int index)`: Removes an item by index with automatic pointer realignment and boundary checking.
  * `getItem(int index)`: Traverses to and retrieves the data item at a target index.
  * `removeAll()`: Clears all node references for proper garbage collection.
  * `size()` & `isEmpty()`: Constant-time state queries.
  * `toString()`: Formatted linear traversal of all elements in the list.

---

## ⏱ Time & Space Complexity

| Operation | Best Case | Worst / Average Case | Space Complexity |
| :--- | :---: | :---: | :---: |
| Insert at Head (`index = 0`) | $O(1)$ | $O(1)$ | $O(1)$ |
| Insert at Arbitrary Index | $O(1)$ | $O(N)$ | $O(1)$ |
| Delete at Head (`index = 0`) | $O(1)$ | $O(1)$ | $O(1)$ |
| Delete at Arbitrary Index | $O(1)$ | $O(N)$ | $O(1)$ |
| Access / Search (`getItem`) | $O(1)$ | $O(N)$ | $O(1)$ |
| Clear All (`removeAll`) | $O(1)$ | $O(1)$ | $O(1)$ |

---

## 📂 Architecture

* **`Node.java`**: Self-referential class defining node elements (`item: String`, `next: Node`).
* **`ADTGroceryList.java`**: Main ADT implementing list business logic, traversal loops, and edge validation.
* **`ADTListTestProgram.java`**: Driver test suite covering 33 distinct unit tests (boundary limits, negative indices, head/tail mutations, and mass deletion).

---

## 🚀 How to Compile & Run

Open your terminal in the directory containing the files:

```bash
# 1. Compile all Java files with package structure
javac -d . *.java

# 2. Run the test driver suite
java adtlinkedlist.ADTListTestProgram
