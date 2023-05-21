# Week 11

In lab today you will implement an ADT queue. The ADT queue operations are listed on page 411 of the textbook. Your implementation will use an array as described on pages 419-424 to perform the following operations. Notice that the operation isFull() is added to the list of operations so accommodate the size limit for an array. Also, the queue contains only positive integers.

```
createQueue ()
// Create an empty queue of integers

isEmpty(): Boolean
// Determines whether the queue is empty

isFull(): Boolean
// Determines whether the queue is full

enqueue(in newItem: integer)
// Adds a new integer to the back of the queue
// If queue is full, do nothing

dequeue(): interger
// Returns and removes the front integer from the queue
// If queue is empty return -1

dequeueAll()
// Removes all integers from the queue

peek(): integer
// Returns the front integer from the queue
// If queue is empty return -1

display()
// Displays the entire queue from front to back item
// Display front, back, count, and size
```

For this lab you may work in pairs. The name of your ADT stack is IntQueue. (Recall that this is not a reference-based list, so you will not use a node class.) Test your ADT list with the file TestIntQueue.java on Blackboard. You are successful when you output matches the output on back of this sheet.

```
Create new queue size 5
Queue is empty
------------------------
Add '1' and '2'
front = 0 back = 1 count = 2 size = 5
queue --> 1 2
------------------------
Dequeue item 1
front = 1 back = 1 count = 1 size = 5
queue --> 2
------------------------
Add '9', '11', and '1'
front = 1 back = 4 count = 4 size = 5
queue --> 2 9 11 1
------------------------
Dequeue items 2 and 9
front = 3 back = 4 count = 2 size = 5
queue --> 11 1
------------------------
Add '78', '4', and '39'
front = 3 back = 2 count = 5 size = 5
queue --> 11 1 78 4 39
------------------------
Add '6'
Queue is full
front = 3 back = 2 count = 5 size = 5
queue --> 11 1 78 4 39
------------------------
Dequeue items 11 and 1
front = 0 back = 2 count = 3 size = 5
queue --> 78 4 39
------------------------
Dequeue all items
Queue is empty
------------------------
Queue is empty
Dequeue item -1
Queue is empty
------------------------
Process completed.
```