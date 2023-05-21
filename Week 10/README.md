# Week 10

In this week’s lab, you will implement an ADT stack. The ADT stack operations are listed on page 356 of the textbook. Your implementation will use a linked list to perform the following operations.

```
createStack()
// Create an empty stack of integers

isEmpty(): Boolean
// Determines whether the stack is empty

push(in newItem: integer)
// Adds a new integer to the top of the stack

pop(): int
// Returns and removes top integer from the stack

popAll()
// Removes all integers from the stack

peek(): int
// Returns the top integer on the stack

display()
// Displays the entire stack from top to last item
```

For this lab you may work in pairs. The name of your ADT stack is IntStack. Test your ADT list with the file TestStack.java on Blackboard. You are successful when you output matches the output below. Recall that you will need to use a node class where the data item is type int.

```
Is empty = true Size = 0
Stack is empty = true

Push two intergers: 3 and 5
Stack is empty = false
top-->5 3

Pop top item
Stack is empty = false
top-->3

Push two intergers: 9 and -6
Stack is empty = false
top-->-6 9 3

Top item on the stack is -6

Pop two items
Stack is empty = false
top-->3

Push two intergers: 11 and 99
Stack is empty = false
top-->99 11 3

Remove all integers
Stack is empty = true
Stack is empty

Process completed.