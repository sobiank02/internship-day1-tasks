# Java Day 5 - Iterators

## Topics Covered

This practical task demonstrates:

1. Iterator
2. For-each loop
3. ListIterator
4. Reverse traversal using ListIterator
5. Fail-Fast behavior
6. ConcurrentModificationException
7. Fail-Safe behavior
8. CopyOnWriteArrayList
9. Real-world hospital simulation

## Task 1: Iterate List Manually

The program demonstrates:
- Iterator
- For-each loop
- ListIterator
- Reverse traversal using ListIterator

## Task 2: Fail-Fast

ArrayList is used to demonstrate Fail-Fast behavior.

When the list is modified while an Iterator is processing it,
ConcurrentModificationException occurs.

## Task 3: Fail-Safe

CopyOnWriteArrayList is used to demonstrate Fail-Safe behavior.

The list can be modified while it is being traversed without
throwing ConcurrentModificationException.

## Task 4: Real-World Simulation

A hospital doctor-processing scenario is demonstrated using:

- ArrayList for Fail-Fast behavior
- CopyOnWriteArrayList for Fail-Safe behavior

## Technologies Used

- Java
- ArrayList
- Iterator
- ListIterator
- CopyOnWriteArrayList

## How to Run

Compile:

```bash
javac IteratorDemo.java