# Week 2 - Day 4: Java Collections

## Task: Scenario-Based Collection Decisions

This practical task demonstrates the selection and implementation of suitable Java Collections for 10 real-world scenarios.

## Scenarios

| No. | Scenario | Collection | Reason |
|---|---|---|---|
| 1 | Maintain order of attendance list | LinkedHashSet | Stores unique values while maintaining insertion order. |
| 2 | Remove duplicates from exam submissions | HashSet | Stores only unique values and removes duplicates. |
| 3 | College timetable sorted by time | TreeMap | Stores time as keys and automatically sorts the entries. |
| 4 | Student roll number and name lookup | HashMap | Stores roll number as key and student name as value for quick lookup. |
| 5 | Manage print queue jobs | Queue | Follows FIFO (First In, First Out) order. |
| 6 | Keep browser back-forward history | Deque | Supports adding and removing elements from both ends. |
| 7 | Store leaderboard scores sorted | TreeMap | Automatically maintains scores in sorted order. |
| 8 | Store products in ecommerce | HashMap | Stores product ID as key and product name as value. |
| 9 | Cache with insertion order | LinkedHashMap | Maintains the insertion order of key-value pairs. |
| 10 | Manage tasks by priority | PriorityQueue | Processes tasks according to their priority. |

## Technologies Used

- Java
- Java Collections Framework
- VS Code

## Project Structure

```text
src/
└── collections/
    ├── AttendanceList.java
    ├── ExamSubmissions.java
    ├── CollegeTimetable.java
    ├── StudentLookup.java
    ├── PrintQueue.java
    ├── BrowserHistory.java
    ├── Leaderboard.java
    ├── EcommerceProducts.java
    ├── Cache.java
    └── PriorityTasks.java