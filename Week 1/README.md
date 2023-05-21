# Week 1

One of your labs in CSC 110L was simulating the Game of Craps which is described below:

The game of craps is played as follows: a player rolls two six-sided dice. If the total is a 2, 3 or 12, the player loses immediately (or the house wins). If the total is a 7 or 11, the player wins immediately. Otherwise, the number rolled becomes the “point.” In this case, the player keeps rerolling the dice until either the point is rolled again, in which case the player wins, or a 7 is rolled, and the house wins. For example, if the initial roll is a 9, the player keeps rolling the dice, and wins if another 9 is rolled before a 7 is rolled.

Write a program which simulates playing craps repeatedly, and keeps track of the number of times the player wins and the number of times the house wins. It should then print these values out as absolute numbers and as percentages. Your program should begin by prompting the user to enter the number of games to play.

For example, if the user specifies that the game should be played 10, 000 times, running the program might look as follows:

    How many times should we play the game? 10000
    The player won 4869 out of 10000 games (48.69%)
    The house won 5131 out of 10000 games (51.31%)

As part of your program, use a function

    def playGame : Boolean

which plays a single game of craps, and returns true if the player wins and false if the house wins. Put a comment above each function in your program that describes what that particular function does.

Hint: To simulate the roll of a single die, use: (6*math.random).toInt +1

Activity: Use the process you developed, for translating a Scala program to Java to translate the Scala program, Craps, to Java.