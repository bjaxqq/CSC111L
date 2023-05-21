# Week 5

For this activity you will implement an array-based ADT list of characters. The arraybased ADT list is discussed in the textbook on pages 226-233. Your implementation of the list will perform the following operations.

```
createList(size: integer)
// A constructor that creates an empty unordered list of characters with a length of “size”

isEmpty(): Boolean
// Return true of the list is empty and false, otherwise

size(): integer
// Returns the number of items that are in the list

addItem(newItem: character)
// Adds an item specified by “character” at the end of the list

removeItem (index: integer)
// Removes an item from the list at position specified by “index”

removeAll()
// Removes all items from the list

getItem(index: integer): character
// Returns the character at position specified by “index”

display()
// Displays the entire list in index order
```

For this lab you may work in pairs. The name of your array-based ADT list is UnorderedList. Test your array-based ADT list with the file TestUnorderedList.java on Blackboard. You are successful when you output matches the output below.

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