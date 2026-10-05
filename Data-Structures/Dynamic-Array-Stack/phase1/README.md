# 📚 Stack Data Structures: Array & Reference-Based

A comprehensive Java project demonstrating the architectural design and implementation of Stack data structures. This project avoids standard Java Collections (`java.util.Stack`), focusing instead on building the data structures from scratch to showcase memory management, encapsulation, and algorithmic efficiency. 

The project is divided into two distinct implementations: **Dynamic Array-Based** and **Reference (Node)-Based**.

---

## 📂 Architecture & Implementations

### Phase 1: Dynamic Array-Based Stack (`phase1/`)
An array-based implementation featuring an automatic capacity-resizing algorithm.
* **Dynamic Memory Management**: When the internal array reaches its maximum capacity, it automatically allocates a new array of double the size ($O(N)$ amortized time complexity) and safely transfers elements, preventing stack overflow.
* **Primitive Wrapper Optimization**: Utilizes Auto-boxing for seamless conversion and memory-efficient primitive handling.
* **Custom Exception Handling**: Introduces `StackException` to elegantly handle edge cases such as popping or peeking from an empty stack.

### Phase 2: Reference-Based Stack (`phase2/`)
A dynamic, infinitely scalable stack implemented using a custom Linked-List `Node` architecture.
* **Strict Encapsulation**: The `Node` class tightly encapsulates its data (`item`) and reference pointer (`next`), accessible only via secure getter/setter methods.
* **True Dynamic Sizing**: Allocates memory node-by-node only when pushed, achieving an $O(1)$ exact time complexity for all stack operations without the need for array resizing overhead.
* **Practical Application (Palindrome Recognition)**: Includes `StringRecognizer.java`, a practical driver class that utilizes the Last-In-First-Out (LIFO) property of the stack to evaluate symmetrical language patterns (e.g., verifying if a string matches the `w$w'` reverse-palindrome format). Features robust input validation to prevent runtime crashes.

---

## 🛠 Core Concepts Demonstrated

* **Interface-Driven Development**: Both phases implement a unified `StackInterface`, enforcing a strict API contract (`push`, `pop`, `peek`, `isEmpty`, `popAll`) and providing thorough JavaDoc specifications.
* **Object-Oriented Programming (OOP)**: Demonstrates strong encapsulation, proper access modifiers (`public`, `private`), and abstract data typing.
* **Algorithmic Validation**: Utilizing LIFO architecture to solve real-world logic problems (string reversal and syntax recognition).

---

## 🚀 How to Compile & Run

Open your terminal in the root directory containing the `phase1` and `phase2` folders.

### Running Phase 1 (Array-Based)
```bash
# Compile the phase1 package
javac phase1/*.java

# Run the stack tester driver
java phase1.StackTester
```

### Running Phase 2 (Reference-Based Application)
```bash
# Compile the phase2 package
javac phase2/*.java

# Run the string palindrome recognizer
java phase2.StringRecognizer
```
