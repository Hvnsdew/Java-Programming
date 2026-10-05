# 🔺 Shape Polymorphism Project

A comprehensive Java project demonstrating core **Object-Oriented Programming (OOP)** principles, specifically inheritance, abstraction, and polymorphism. The project is structured into two evolutionary phases, starting from a console-based foundational model and advancing to a visual Graphical User Interface (GUI) implementation using Java Swing and AWT.

---

## 📂 Project Structure & Phases

### Phase 1: Console-Based Polymorphism
Located in the `phase1/` package, this phase establishes the architectural foundation:
* **Abstract Base Class**: The `Shape` class defines common properties (`x`, `y` coordinates) and abstract methods (`getArea()`).
* **Concrete Subclasses**: `Circle`, `Rectangle`, and `Triangle` inherit from `Shape`, providing specific geometric formulas and overriding `toString()`.
* **Polymorphic Execution**: `ShapeTester` aggregates various shape instances into a single `Shape[]` array. It iterates through the array to dynamically invoke overridden methods, calculating the total area and printing properties without needing to know the specific type of each shape at compile time.

### Phase 2: GUI & Visual Rendering
Located in the `phase2/` package, this phase extends the architecture to include graphical rendering:
* **Abstract Drawing**: Introduces the `drawShape(Graphics g)` abstract method to the `Shape` class.
* **AWT/Swing Integration**: Each concrete subclass overrides `drawShape()` using `java.awt.Graphics` methods (e.g., `drawOval`, `drawRect`, `drawLine`) to draw itself based on its internal coordinates and dimensions.
* **GUI Driver**: `ShapeGUITester` utilizes a `JFrame` and a custom `JPanel`. It overrides `paintComponent(Graphics g)` to iterate through the polymorphic shape array, delegating the rendering logic to each individual object.

---

## 🛠 Core OOP Principles Demonstrated

* **Polymorphism**: Treating derived objects (`Circle`, `Rectangle`, `Triangle`) as instances of their base class (`Shape`) within arrays and loops.
* **Abstraction**: Hiding implementation details via the `Shape` abstract class, enforcing a contract (`getArea()`, `drawShape()`) that subclasses must fulfill.
* **Encapsulation**: Protecting class state (e.g., `radius`, `width`, `height`) using `private` access modifiers and exposing them safely via getter and setter methods.
* **Method Overriding (`@Override`)**: Customizing base class behaviors in child classes to execute shape-specific logic.

---

## 🚀 How to Compile & Run

Open your terminal in the root directory containing the `phase1` and `phase2` folders.

### Running Phase 1 (Console)

```bash
# Compile the phase1 package
javac phase1/*.java

# Run the console tester
java phase1.ShapeTester
```

### Running Phase 2 (GUI)

```bash
# Compile the phase2 package
javac phase2/*.java

# Run the GUI visualizer
java phase2.ShapeGUITester
```
