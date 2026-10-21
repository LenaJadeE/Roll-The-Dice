package com.pluralsight;

public class Dice {
    public int roll() {
        int minValue = 1;
        int maxValue = 6;
        return (int) (Math.random() * (maxValue - minValue + 1)) + minValue;

    }
}


//  EXERCISE 2
// Step 1
// You will program an application that will roll a pair of dice 100 times.
// Display the value of the two dice each time they are rolled.
// Count how many times the sum of the two dice is 2, 4, 6 or 7 are rolled and display the result.
// To make this work, you need to create a class named Dice and add a method named roll() that generates a random number between 1 and 6.
// You can generate a random number within a range using the following algorithm:
//      int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue
// Now switch back to your main() method:
//      1. Create an instance of Dice named dice.
// Also create integer variables for roll1, roll2, and four different counters for the number of times 2, 4, 6 and 7 are rolled
//      2. Create a loop that executes 100 times.
//      3. Within the loop, call your dice's roll() method two times:
//          roll1 = dice.roll();
//          roll2 = dice.roll();
// Exercises - Looping
//      4. Print the value of each roll of the dice formatted like this:
//          Roll 1:   4  -  6   Sum:  10
//      5. Determine if the sum of roll1 and roll2 is 2, and if so, increment the twoCounter.
//      6. Determine if the sum of roll1 and roll2 is 4, and if so, increment the fourCounter.
//      7. Determine if the sum of roll1 and roll2 is 6, and if so, increment the sixCounter.
//      8. Determine if the sum of roll1 and roll2 is 7, and if so, increment the sevenCounter.
//      9. When the loop terminates, display your counters!
// Step 2
//      1. Ensure all your changes are committed and pushed to GitHub
//      2. Send your repository URL to your Instructor