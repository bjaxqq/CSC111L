# Week 9 

In lab today you will implement a list-based ADT list. The list-based ADT list is discussed in the textbook on pages 253-277. Your implementation of the list will perform the following operations.

```
createList()
// Create an empty unordered list of characters

isEmpty(): Boolean
// Determines whether a list is empty

size(): integer
// Returns the number of items that are in the list

add(in newItem: character)
// Adds an item at the end of the list

remove (in index: integer)
// Removes an item from the list a position index

removeAll()
// Removes all items from the list

get(in index: integer): character
// Returns the character at position index

display()
// Displays the entire list in index order
```

For this lab you may work in pairs. The name of your list-based ADT list is UnorderedList. Test your list-based ADT list with the file TestUnorderedList.java on Blackboard. You are successful when you output matches the output below.

```
Is empty = true Size = 0
List is empty
--------
Add 'a' and 'c'
a c
Is empty = false Size = 2
--------
Add 'd' and 'f'
a c d f
Is empty = false Size = 4
The item at index 2 is d
--------
Remove 'c'
a d f
Is empty = false Size = 3
--------
Remove 'f'
a d
Is empty = false Size = 2
--------
Remove All
List is empty
Is empty = true Size = 0
Process completed.
```