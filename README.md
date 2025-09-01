# 📘 Java Learning Guide (From Basics to Advanced)

This guide is structured step-by-step to help you learn **Java** from scratch, especially if you are coming from **C++** or another programming language.

---

## 1. Introduction to Java

* **Platform independent**: Compiles to bytecode, runs on JVM.
* **Pure OOP**: Almost everything is inside a class.
* **No pointers**: Uses references.
* **Automatic memory management**: Garbage Collector.

---

## 2. Java Program Structure

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

* `public class HelloWorld` → every file must have a class.
* `main` → entry point.
* `System.out.println` → output.

---

## 3. Variables and Data Types

### Primitive Types

* `int`, `long`, `float`, `double`
* `char` (Unicode)
* `boolean` (true/false)
* `byte`, `short`

### Reference Types

* `String`, `Arrays`, `Objects`

Example:

```java
int age = 20;
boolean isAdult = true;
String name = "Namit";
```

---

## 4. Operators

* Arithmetic: `+ - * / %`
* Relational: `== != > < >= <=`
* Logical: `&& || !`
* Assignment: `= += -= *= /=`

---

## 5. Input & Output

```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = sc.next();
        System.out.println("Number: " + x + ", Word: " + str);
        sc.close();
    }
}
```

---

## 6. Control Statements

* `if`, `else if`, `else`
* `switch` (also works with Strings)
* Loops: `for`, `while`, `do-while`

```java
for (int i=0; i<5; i++) {
    System.out.println(i);
}
```

---

## 7. Arrays

```java
int[] arr = {1, 2, 3, 4};
System.out.println(arr[0]);
```

* Multi-dimensional:

```java
int[][] matrix = {{1,2}, {3,4}};
```

---

## 8. Strings

* Immutable.
* Methods: `.length()`, `.charAt()`, `.substring()`, `.equals()`

```java
String s = "Hello";
System.out.println(s.length());
```

---

## 9. Methods

* Must be inside a class.
* Can be `static` or instance-level.

```java
class MathOps {
    static int add(int a, int b) {
        return a + b;
    }
}
```

---

## 10. Object-Oriented Programming

### Classes & Objects

```java
class Car {
    String name;
    Car(String n) { this.name = n; }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        System.out.println(c.name);
    }
}
```

### Access Modifiers

* `public`, `private`, `protected`, *default* (package-private)

---

## 11. Inheritance

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}
```

---

## 12. Polymorphism

* **Method Overloading**: Same method name, different parameters.
* **Method Overriding**: Subclass redefines parent’s method.

---

## 13. Abstract Classes & Interfaces

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() { System.out.println("Bird flies"); }
}
```

---

## 14. Static & Final

* `static`: Belongs to class, not object.
* `final`: Constant or prevents overriding.

```java
final int MAX = 100;
```

---

## 15. Exception Handling

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e);
} finally {
    System.out.println("Always runs");
}
```

---

## 16. Packages & Import

* `package mypackage;`
* `import java.util.*;`

---

## 17. Collections Framework

* `ArrayList`, `HashMap`, `HashSet`

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);

HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1);
```

---

## 18. Generics

```java
class Box<T> {
    T value;
    Box(T v) { value = v; }
}
Box<Integer> b = new Box<>(100);
```

---

## 19. Multithreading

```java
class MyThread extends Thread {
    public void run() { System.out.println("Thread running"); }
}

public class Main {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
```

---

## 20. Advanced Topics (Overview)

* **Streams & Lambda Expressions**
* **File I/O (`java.io` and `java.nio`)**
* **JDBC (Database Connectivity)**
* **Annotations & Reflection**
* **Java Memory Model & Garbage Collection**

---

# ✅ Learning Path Summary

1. Basics (syntax, data types, operators)
2. Control Flow (if, loops, switch)
3. Methods, Arrays, Strings
4. Classes, Objects, OOP (Inheritance, Polymorphism, Abstraction)
5. Access Modifiers, Static, Final
6. Exception Handling
7. Collections Framework
8. Generics
9. Multithreading
10. Advanced Java (Streams, File I/O, JDBC, Reflection)

---

This file acts as a **step-by-step Java guide** for learning from basics to advanced concepts.
