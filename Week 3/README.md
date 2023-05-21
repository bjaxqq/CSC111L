# Week 3

In this lab you will experiment with reading a formatted file and assigning components to an internal data structure. In this case, you will read a maze consisting of x and space characters and assign each character to an element of a two-dimensional array. Instead of giving you code to modify, this lab will give “higher level” descriptions. You may refer to class notes, class activities, and labs to construct your solution.

The file you are reading consists of 7 rows of 20 characters each. The file is SimpleMaze.txt available on Blackboard with this lab.

Do the lab in four steps.
- Step 1: Modify your program from the File IO Activity to read each line of the file as a string, then print it to the screen. This tests whether you can access the file and read its contents.
- Step 2: For each line read from the file as a string, extract each character in order and print it to the screen. This tests whether you can access each character on a line. Recall that to do this you will need nested loops.
- Step 3: Assign reach character to a two-dimensional array of char. You will need to delay testing until you write code to print the two-dimensional array contents. What you can do is simply print to the screen when you have completed the process.
- Step 4: Print the two-dimensional array contents to the screen. Similar to Step 2, you will need nested loops.

When you have successfully completed these 4 steps, you are prepared to start the second programming assignment when it is assigned. (It is a maze navigation program!)

Challenge: Modify your program to read a maze file that contains the size of the maze as two integers on the first line of the file followed by the maze starting on the second line of the file. For example, the first line of a modified file SizedMaze.txt consists of
two integers 7 20 that define the size the maze as 7 rows by 20 columns. The order is important!