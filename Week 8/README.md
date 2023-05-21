# Week 8

### Objective
In this lab you will you will test the Selection Sort method on a randomly-generated array of integers to understand how it works. You will add a counter that counts the number of comparisons as the Selection Sort sorts an array. You will gather data on comparison for varioussized arrays and generate a graph of the results.

### References
- Textbook pp 519-522

### Sample Files
SortMethods.java is located on the Blackboard in Course Material with this lab.

### Lab Exercises
1. Download the file SortMethods.java. The class SortMethods contains a static method selectionSort that you will use to sort an array. It also contains static methods printArray that prints an array, copyArray that returns an integer array copy of its argument and randomIntArray that generates an array of random integers given an array size and a range of integers.
2. Create a class TestSortMethods to do the exercises for this lab. Create an array of random integers of size 10 with a range of 100.0. Print the array. Sort the array using the selectionSort method. Verify that the method is sorting the array using the Selection Sort.
3. In the SortMethods class, create a static method selectionSortComparisons that is a copy of the static method selectionSort that does not print the array after each pass and counts the number of comparisons. Comparisons are made by the if-statement in the for-loop that finds the largest element in the unsorted array. The total number is to be returned by the method. To test the method do the following: Create a random array of integers. Make a copy of the array. Use selectionSort to sort on one of the arrays. Report the number of comparisons by using selectionSortComparisons to sort the copy.
4. Create arrays of random integers with the following sizes: 50, 100, 250, 500, 750, 1000. Report the number of comparisons required by the Selection Sort to sort each array. Plot the results on a graph of array size versus number of comparisons. Do your results agree with the analysis in the textbook on page 522?