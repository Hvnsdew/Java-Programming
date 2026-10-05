# 📊 Galton Board (Bean Machine) Simulation

A Java-based statistical simulation of a Galton Board (Bean Machine) designed to visually demonstrate the **Binomial Distribution**. As balls are dropped through a triangular array of pegs, they have a 50/50 chance of falling left or right at each level, naturally forming a bell curve (normal distribution) at the bottom slots.

---

## 🛠 Core Features & Optimizations

* **Algorithmic Memory Optimization**: Rather than storing the exact path or final position of every single ball ($O(N)$ space complexity, which causes performance degradation with millions of inputs), this implementation optimally records only the *cumulative count* of balls per slot ($O(K)$ space complexity, where $K$ is the number of slots).
* **Statistical Visualization**: Dynamically generates a formatted console-based histogram (`O` characters) representing the final distribution of the balls, perfectly illustrating the Central Limit Theorem in action.
* **Robust Resource Management**: Ensures proper closure of `java.util.Scanner` streams to prevent memory and resource leaks.

---

## 🚀 How to Compile & Run

Open your terminal in the directory containing the project.

```bash
# Compile the Java file
javac BeanMachine.java

# Run the simulation
java BeanMachine
```

**Example Usage:**
```text
Enter the number of balls to drop : 5
Enter the number of slots in the bean machine : 8

LRLRLRL
RRLLLRR
LLRLLRR
RRRRLLL
RLLLRLL

Histogram
Slot  Beans
   0  
   1  
   2  
   3  O O O 
   4  O O 
   5  
   6  
   7  
```
