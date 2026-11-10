# 🔗 Student PRN Management using Singly Linked List (Java)

A Data Structures program that stores the PRN numbers of admitted students in a **singly linked list**.
(Data Structures Lab – Experiment 8)

## Problem Statement
The admission office needs to keep a list of student PRNs where:
- **a)** the PRN of every newly admitted student is added at the **end** of the list, and
- **b)** the PRN of a student whose admission is **cancelled** is deleted from the list.

A linked list suits this because the number of students changes, and the list grows or shrinks without a fixed size (unlike an array).

## Concepts Used
- **Self-referential class** `Node` (data + reference to next node)
- **Dynamic memory allocation** using `new`
- **Traversal** of a linked list using a temporary pointer
- **Insertion at end** – O(n)
- **Deletion by value** – O(n), handling three cases: first node, middle/last node, and PRN not found

## How It Works
```
Insert at end:  head → [1001] → [1002] → [1003] → NULL
                                             temp.next = newNode → [1005]

Delete 1003:    prev → [1002] ──┐   [1003]   ┌──→ [1004]
                                 └────────────┘  (prev.next = prev.next.next)
```

## How to Run
```bash
javac Main.java
java Main
```
Or paste `Main.java` into any online Java compiler.

## Output
```
Admitted  : 2026001001
Admitted  : 2026001002
Admitted  : 2026001003
Admitted  : 2026001004
2026001001 -> 2026001002 -> 2026001003 -> 2026001004 -> NULL
Admitted  : 2026001005
2026001001 -> 2026001002 -> 2026001003 -> 2026001004 -> 2026001005 -> NULL
Cancelled : 2026001003
Cancelled : 2026001001
PRN 2026009999 not found.
2026001002 -> 2026001004 -> 2026001005 -> NULL
```

## Author
**[Your Name]** – S.Y. B.Tech CSE, JSPM University Pune
