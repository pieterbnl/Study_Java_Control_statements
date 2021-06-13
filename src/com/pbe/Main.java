package com.pbe;

import java.io.IOException;
import java.util.Scanner;

/** Class to demonstrate the use of Control statements and flow in various variations.
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

public class Main {

    /* Java's program control statements can be put into the following categories:
    1. Selection; make program choose different paths of execution based upon the outcome of an expression or state of a variable
    2. Iteration; repeat program statement execution one or more times
    3. Jump; have program execute in nonlinear fashion
    4. Exceptions */
    public static void main(String[] args) throws IOException {

        // Setting some initial variables
        int a, b, c, d, sum1, sum2;
        boolean a1, b1, c1, d1, e1, f1, g1;
        double f, g, h, i;

        // *********************
        // SELECTION STATEMENTS
        // *********************

        // SELECTION BY IF STATEMENT

        // If statement
        System.out.println("If statement");
        a = 1;
        b = 5;
        a1 = true;
        if (a<b) System.out.println("a is smaller than b");
        if (a1) System.out.println("a1 is set to true \n");


        // If - else statement
        System.out.println("If - else statement");
        a = 5;
        b = 1;
        if (a<b) System.out.println("a is smaller than b \n");
        else System.out.println("b is smaller than a \n");

        // Nested ifs
        System.out.println("Nested ifs");
        a = 3;
        b = 10;
        if (a == 3) {
            if (b == 10) System.out.println("a is 3 and b is 10 \n");
            else System.out.println("a is not 3 and/or b is not 10 \n");
        } else System.out.println("Something else is going on \n");

        // If - else statement in block
        a = 5;
        b = 1;
        System.out.println("If - else statement, in block");
        if (a<b) {
            System.out.println("a is smaller than b \n");
        } else {
            System.out.println("b is smaller than a \n");
        }

        // If - else statement in block, with multiple conditions
        a = 1;
        b = 5;
        a1 = true;
        System.out.println("If - else statement, in block, with multiple conditions");
        if (a<b & a1==true) {
            System.out.println("a is smaller than b");
            System.out.println("a1 is set to true \n");
        } else {
            System.out.println("b is smaller than a \n");
        }

        // If - else 'ladder' statement
        System.out.println("If - else 'ladder' statement");
        a = 10;
        b = 5;
        c = 3;
        if (a > 0) {
            System.out.println("a is larger than 0 \n");
        }
        else if (b > 0) {
            System.out.println("b is larger than 0 \n"); // not carried out because the (a > 0) condition is triggered, causing java to bypass the rest of the ladder
        }
        else if (c > 0) {
            System.out.println("c is larger than 0 \n"); // not carried out because the (a > 0) condition is triggered, causing java to bypass the rest of the ladder
        } else {
            System.out.println("Whatever else may be the case \n");
        }

        // Another if - else 'ladder' statement; note {} are not required in this example of one line of code per statement
        System.out.println("Another if - else 'ladder' statement");
        a = 6;
        if (a==1 || a==2 || a==5)
            System.out.println("a is 1, 2 or 5 \n");
        else if (a==3 || a==4 || a==10)
            System.out.println("a is 3, 4 or 10 \n");
        else if (a==5 || a==6 || a==7)
            System.out.println("a is 5, 6 or 7 \n");
        else if (a==8 || a==9)
            System.out.println("a is 8 or 9 \n");
        else
            System.out.println("a is something else than 1 to 10 \n");

        /* SELECTION BY SWITCH STATEMENT
        Switch statement; multiway branch statement - especially useful for menu selections
        Three important notes on the switch statement:
        1. Switch can only test for equality as it looks only for a match between the value of the expression and one of it's case constants.
        If on the other hand can evaluate any type of boolean expression.
        2. No two case constants in the same switch can have identical values.
        3. Switch statement is usually more efficient that a set of nested ifs.
        When Java compiles the switch statement it will inspect each case constant and create a reference table for jumps.
        This will be used as path selection depending on the expression value. Making it with large groups of values run faster than if-else constructions. */

        // Switch statement; multiway branch statement - especially useful for menu selections
        System.out.println("Switch statement");
        int userinput = 2;
        switch(userinput) {
            case 0:
                System.out.println("User selected 0 \n");
                break; // addition of break is required to prevent the other cases to be executed
            case 1:
                System.out.println("User selected 1 \n");
                break;
            case 2:
                System.out.println("User selected 2 \n");
                break;
            case 3:
                System.out.println("User selected 3 \n");
                break;
            default: // will be executed if none of the other cases matched
                System.out.println("Default selection \n");
        }

        // Switch statement without breaks
        System.out.println("Switch statement without breaks");
        userinput = 2;
        switch(userinput) {
            case 0: System.out.println("User selected 0");
            case 1: System.out.println("User selected 1");
            case 2: System.out.println("User selected 2");
            case 3: System.out.println("User selected 3");
            default: System.out.println("Default selection \n");
        }

        // Switch statement with multiple cases 'combined'
        System.out.println("Switch statement multiple cases 'combined'");
        userinput = 4;
        switch(userinput) {
            case 0:
            case 1:
            case 2:
                System.out.println("User selected 0, 1 or 2 \n");
                break;
            case 3:
            case 4:
                System.out.println("User selected 3 or 4 \n");
                break;
            default:
                System.out.println("Default selection \n");
        }

        // Switch statement with use of a string as control
        System.out.println("Switch statement with use of string as control");
        String str_input = "two";
        switch(str_input) {
            case "one":
                System.out.println("User choose one \n");
                break; // addition of break is required to prevent the other cases to be executed
            case "two":
                System.out.println("User choose two 1 \n");
                break;
            case "three":
                System.out.println("User choose three 2 \n");
                break;
            default: // will be executed if none of the other cases matched
                System.out.println("Default selection \n");
        }

        // Nested switch statement
        a = 1;
        b = 3;
        switch(a) {
            case 1:
                switch(b) {
                    case 1:
                        System.out.println("Switch a - Switch b - case 1 \n");
                        break;
                    case 2:
                        System.out.println("Switch a - Switch b - case 2 \n");
                        break;
                    case 3:
                        System.out.println("Switch a - Switch b - case 3 \n");
                        break;
                }
                break; // break needed to end this nested switch! or case 2 will be executed as well and then break
            case 2:
                System.out.println("Switch a - case 2 \n");
                break;
            case 3:
                System.out.println("Switch a - case 3 \n");
                break;
        }


        // *********************
        // ITERATION STATEMENTS
        // *********************

        // Java iteration statements are: for, while and do-while.

        // While statement - Java's most fundamental loop statement, repeating a statement or block while its controlling expression is true
        System.out.println("While statement");
        a = 5;
        while(a < 10) { // iterating until a is larger than 10
            System.out.println("a is: " + a);
            a++; // increment a
        }
        System.out.println();

        // While statement that's not executed
        System.out.println("While statement that's not executed ;-)");
        a = 5;
        b = 5;
        while (a>b)
            System.out.println("This will not be executed because the case a>b is never true with the given values");
        System.out.println();

        // While statement with empty body
        System.out.println("While statement with empty body");
        a = 10;
        b = 20;
        while(++a < --b); // a will increment and b will decrement, while being compared, stopping the loop when a is bigger than b
        System.out.println("Midpoint between a and b is: " + a + " \n");

        // Do-While statement - If the condition in a while loop is false, it will never run. The do-while loop will run at least once.
        System.out.println("Do-While statement");
        a = 5;
        do {
            System.out.println("a is: " + a);
            a++; // increment a
        } while(a < 11);
        System.out.println();

        // or in short
        a = 5;
        do {
            System.out.println("a is: " + a);
        } while(a++ < 10);
        System.out.println();

        // Do-while as menu selection
//        System.out.println("Do-while as menu selection");
//        char choice;
//        do {
//            System.out.println("1. Item 1 ");
//            System.out.println("2. Item 2 ");
//            System.out.println("3. Item 3 ");
//            System.out.println("4. Item 4 ");
//            System.out.println("5. Item 5 ");
//            System.out.print("Make your selection: \n");
//            choice = (char) System.in.read(); // reading keyboard input from user;
//            //Scanner in = new Scanner(System.in); // alternative method to read input from user via console
//        } while (choice < '1' || choice > '5'); // keep iterating until user provides an input of 1 up and to 5
//        System.out.println("User selected item " + choice);
//        System.out.println();

        // For loop
        System.out.println("For loop");
        for (a=5; a<11; a++) { // note that the control variable can also be initialized inside the loop itself, i.e. for example ->> for (int x=5; x<11; x++)
            System.out.println("a now is: " + a); // note that the scope of this variable extends only to the for loop itself, outside it will no longer exist
        }
        System.out.println();

        // For loop to calculate sum
        System.out.println("For loop to calculate sum");
        int sum = 0;
        for (a=0; a<10; a++) { // note that the control variable can also be initialized inside the loop itself, i.e. for example ->> for (int x=5; x<11; x++)
            sum += a;
        }
        System.out.println("The sum is: " + sum);
        System.out.println();

        // For loop to check for prime numbers
        // Note: A prime number is only divisible by 1 and by itself. If it's divisible by any other number, it's not a prime number.
        System.out.println("For loop to check for primes");
        boolean check = false; // set initial check to false
        int checknum = 5; // set number to check
        for (a = 2; a <= checknum / 2; ++a) { // Looping from 2 to checknum/2 as a prime number should not be divisible by more than its half.
            if (checknum % a == 0) { // With each loop, check if checknum has a remainder. If it has no remainder (i.e. it's divisible), then it is not a prime number.
                check = true; // Not a prime number
                break; // Break out of loop
            }
        }
        if (!check) {
            System.out.println(checknum + " is a prime number. \n");
        } else {
            System.out.println(checknum + " is not a prime number. \n");
        }

        // For loop with multiple control variables; separated by comma
        System.out.println("For loop with multiple control variables");
        for (a=5, b=10; a<b; a++, b--) {
            System.out.println("a now is: " + a + " and b now is: " + b);
        }
        System.out.println();

        // For loop with boolean as control variable
        System.out.println("For loop with boolean as control variable");
//        a1 = false;
//        for (a=1; !a1; a++) { // for loop continues to run until boolean variable a1 is set to true; i.e. it does not test the value of a
//             if(carryoutsomemethod()) a1 = true
//        }
        System.out.println();

        // For loop without initialization and iteration expression
        System.out.println("For loop without initialization and iteration expression");
        a = 0;
        a1 = false;
        for( ; !a1; ) {
            System.out.println("a is " + a);
            if (a ==5) a1 = true;
            a++;
        }
        System.out.println();

        // For loop, iterating through an array
        System.out.println("For loop, iterating through array");
        int nums[] = { 1, 2, 3, 4, 5 };
        sum = 0;
        for(a=0; a < 5; a++) sum +=nums[a];
        System.out.println("Total sum of numbers in nums: " + sum + " \n");

        // For-each (also referred to as 'enhanced for loop')
        // Cycles through a collection of objects, such as an array, in sequential fashion, from start to finish
        // When using a code block it is possible to terminate the loop earlier by using a break statement
        System.out.println("For-each loop, iterating through array");
        nums = new int[] { 1, 2, 3, 4, 5 };
        sum = 0;
        for (int x : nums) sum += x; // Note: the for-each iteration variable x is 'read only', relating to the underlying array only and cannot be assigned a value
        System.out.println("Total sum of numbers in nums: " + sum + " \n");

        // For-each iterating over a two dimensional array
        System.out.println("For-each loop, iterating over a two dimensional array");
        int[][] numbers = new int[5][5]; // initiate two dimensional array
        int count = 1; // set a value counter

        // loop through arrays with for loop to fill arrays with values
        for(a = 0; a < 5; a++) // loop through first array
            for (b = 0; b < 5; b++) // loop through second array
                numbers[a][b] = count++; // add value to current array element

        // loop through array with for-each loop to read and sum values
        for(int array[] : numbers) { // y referencing to one-dimensional array, with each iteration obtaining the next array in numbers
            for (int value : array) { // inner for loop cycles through each of the arrays
                System.out.println("Value is: " + value); // displaying value of each element
                sum += value; // summing the values
                }
            }
        System.out.println();

        }
}