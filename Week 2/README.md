# Week 2

In lab today you will implement the Monster class and test it using the TestMonster class. The UML diagram below contains the main features of the class.

Create your Monster class in the following order. Include comments according to the CSC 111 Code Comment Standards.
1. Create the Monster class with the following components as shown in the UML class diagram. Recall that the file name must match the class name.
- Instance variables: health and strength
- Constructors: default constructor that sets the value of health and strength to 0.0, and a constructor that allows you to set the value of health and strength
- Getter and setter methods for of health and strength

    At this point you can test your class by commenting out the second half of the TestMonster class that tests the methods defined below. Recall that to run a Java program you must compile each class file including the “.java” extension.
        
        javac Monster.java
        javac TestMonster.java
        
    Then you must run the file that contains the main() method without the “.java” extension.
    
        java TestMonster

2. Add the other methods to the Monster class such that they implement the following behavior.
- attack(): returns a double value that is the product of strength and a random number (0 <= n < 1). Use Math.random() to generate a random number.

To make this work you will need to import the Java Math class. Include the code below at the beginning of your Monster class file.
    import java.lang.Math;

- damage(): takes a double parameter and subtracts if from health.
- isAlive(): returns true if health > 0 and false, otherwise.

3. When your output is similar to the sample output provided, you have successfully created and tested the Monster class; you have successfully completed the lab. Since attach() generates a random number, each run will have a slightly different output. However, the output will have the same behavior when testing the attack(), damage(), and isAlive() methods.

Sample TestMonster class output.
```
Harry with default health and strength
health = 0.0 strength = 0.0
Harry with set health and strength
health = 99.0 strength = 30.0
Test damage, attackValue and isAlive
damage = 16.396299730196134 isAlive = true
health = 82.60370026980387 strength = 30.0
Harry fights himself to the death
damage = 6.676483049968765 isAlive = true
health = 75.9272172198351 strength = 30.0
damage = 3.938114120447308 isAlive = true
health = 71.98910309938779 strength = 30.0
damage = 14.55977714024224 isAlive = true
health = 57.42932595914555 strength = 30.0
damage = 21.657411048679503 isAlive = true
health = 35.77191491046605 strength = 30.0
damage = 5.106591681909634 isAlive = true
health = 30.665323228556417 strength = 30.0
damage = 0.03768544456616896 isAlive = true
health = 30.62763778399025 strength = 30.0
damage = 12.742178607084261 isAlive = true
health = 17.88545917690599 strength = 30.0
damage = 7.129520395615414 isAlive = true
health = 10.755938781290576 strength = 30.0
damage = 14.638318218700503 isAlive = false
health = -3.882379437409927 strength = 30.0
```