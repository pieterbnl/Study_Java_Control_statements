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
        if (a < b) System.out.println("a is smaller than b");
        if (a1) System.out.println("a1 is set to true \n");


        // If - else statement
        System.out.println("If - else statement");
        a = 5;
        b = 1;
        if (a < b) System.out.println("a is smaller than b \n");
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
        if (a < b) {
            System.out.println("a is smaller than b \n");
        } else {
            System.out.println("b is smaller than a \n");
        }

        // If - else statement in block, with multiple conditions
        a = 1;
        b = 5;
        a1 = true;
        System.out.println("If - else statement, in block, with multiple conditions");
        if (a < b & a1 == true) {
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
        } else if (b > 0) {
            System.out.println("b is larger than 0 \n"); // not carried out because the (a > 0) condition is triggered, causing java to bypass the rest of the ladder
        } else if (c > 0) {
            System.out.println("c is larger than 0 \n"); // not carried out because the (a > 0) condition is triggered, causing java to bypass the rest of the ladder
        } else {
            System.out.println("Whatever else may be the case \n");
        }

        // Another if - else 'ladder' statement; note {} are not required in this example of one line of code per statement
        System.out.println("Another if - else 'ladder' statement");
        a = 6;
        if (a == 1 || a == 2 || a == 5)
            System.out.println("a is 1, 2 or 5 \n");
        else if (a == 3 || a == 4 || a == 10)
            System.out.println("a is 3, 4 or 10 \n");
        else if (a == 5 || a == 6 || a == 7)
            System.out.println("a is 5, 6 or 7 \n");
        else if (a == 8 || a == 9)
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
        switch (userinput) {
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
        switch (userinput) {
            case 0:
                System.out.println("User selected 0");
            case 1:
                System.out.println("User selected 1");
            case 2:
                System.out.println("User selected 2");
            case 3:
                System.out.println("User selected 3");
            default:
                System.out.println("Default selection \n");
        }

        // Switch statement with multiple cases 'combined'
        System.out.println("Switch statement multiple cases 'combined'");
        userinput = 4;
        switch (userinput) {
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
        switch (str_input) {
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
        switch (a) {
            case 1:
                switch (b) {
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
        while (a < 10) { // iterating until a is larger than 10
            System.out.println("a is: " + a);
            a++; // increment a
        }
        System.out.println();

        // While statement that's not executed
        System.out.println("While statement that's not executed ;-)");
        a = 5;
        b = 5;
        while (a > b)
            System.out.println("This will not be executed because the case a>b is never true with the given values");
        System.out.println();

        // While statement with empty body
        System.out.println("While statement with empty body");
        a = 10;
        b = 20;
        while (++a < --b)
            ; // a will increment and b will decrement, while being compared, stopping the loop when a is bigger than b
        System.out.println("Midpoint between a and b is: " + a + " \n");

        // Do-While statement - If the condition in a while loop is false, it will never run. The do-while loop will run at least once.
        System.out.println("Do-While statement");
        a = 5;
        do {
            System.out.println("a is: " + a);
            a++; // increment a
        } while (a < 11);
        System.out.println();

        // or in short
        a = 5;
        do {
            System.out.println("a is: " + a);
        } while (a++ < 10);
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
        for (a = 5; a < 11; a++) { // note that the control variable can also be initialized inside the loop itself, i.e. for example ->> for (int x=5; x<11; x++)
            System.out.println("a now is: " + a); // note that the scope of this variable extends only to the for loop itself, outside it will no longer exist
        }
        System.out.println();

        // For loop to calculate sum
        System.out.println("For loop to calculate sum");
        int sum = 0;
        for (a = 0; a < 10; a++) { // note that the control variable can also be initialized inside the loop itself, i.e. for example ->> for (int x=5; x<11; x++)
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
        for (a = 5, b = 10; a < b; a++, b--) {
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
        for (; !a1; ) {
            System.out.println("a is " + a);
            if (a == 5) a1 = true;
            a++;
        }
        System.out.println();

        // For loop, iterating through an array
        System.out.println("For loop, iterating through array");
        int nums[] = {1, 2, 3, 4, 5};
        sum = 0;
        for (a = 0; a < 5; a++) sum += nums[a];
        System.out.println("Total sum of numbers in nums: " + sum + " \n");

        // For-each (also referred to as 'enhanced for loop')
        // Cycles through a collection of objects, such as an array, in sequential fashion, from start to finish
        // When using a code block it is possible to terminate the loop earlier by using a break statement
        System.out.println("For-each loop, iterating through array");
        nums = new int[]{1, 2, 3, 4, 5};
        sum = 0;
        for (int x : nums)
            sum += x; // Note: the for-each iteration variable x is 'read only', relating to the underlying array only and cannot be assigned a value
        System.out.println("Total sum of numbers in nums: " + sum + " \n");

        // For-each iterating over a two dimensional array
        System.out.println("For-each loop, iterating over a two dimensional array");
        int[][] numbers = new int[3][3]; // initiate two dimensional array
        int count = 1; // set a value counter
        // loop through arrays with for loop to fill arrays with values
        for (a = 0; a < numbers.length; a++) // loop through first array
            for (b = 0; b < numbers[a].length; b++) // loop through second array
                numbers[a][b] = count++; // add value to current array element
        // loop through array with for-each loop to read and sum values
        for (int array[] : numbers) { // y referencing to one-dimensional array, with each iteration obtaining the next array in numbers
            for (int value : array) { // inner for loop cycles through each of the arrays
                System.out.println("Value is: " + value); // displaying value of each element
                sum += value; // summing the values
            }
        }
        System.out.println();

        // For-each loop, searching an array (nums = new int[] { 1, 2, 3, 4, 5 }), as previously used)
        System.out.println("For-each loop, searching an array");
        int findVal = 4;
        for (int x : nums) {
            if (x == findVal) {
                System.out.println("Value " + findVal + " has been found \n");
                break;
            }
        }

        // For-each loop, searching an array (nums = new int[] { 1, 2, 3, 4, 5 }), as previously used), with keeping track of index
        // The for-each loop is based on the Iterable interface. I.e. it uses an Iterator to loop through the "collection"
        // This can not be a collection at all and may be something not at all based on indexes (such as a linked list).
        // As such for-each does not have a counter. Instead, index will have to be tracked by adding a counter manually
        System.out.println("For-each loop, searching an array");
        findVal = 4;
        a = -1;
        for (int x : nums) {
            a++;
            if (x == findVal) {
                System.out.println("Value " + findVal + " has been found in index " + a + "\n");
                break;
            }
        }

        // Local variable type inference in a for(-each) loop
        // Local variable type inference (var) can be used when:
        // - declaring and initializing the loop control variable in a for loop
        // - specifying the iteration variable in a enhanced for loop (for-each)
        System.out.println("For and for-each loop, using variable type inference");
        System.out.print("Values of z: ");
        for (var z = 2.0; z < 10.0; z += 2)
            System.out.print(z + ", "); // z is inferred to type double, as that's the type of initializer
        System.out.println();
        System.out.print("Values in nums[]: ");
        for (var v : nums) System.out.print(v + ", ");  // v is inferred to type integer, as that's the type in nums[]
        System.out.println();
        System.out.println();

        // *********************
        // JUMP STATEMENTS
        // *********************

        // Java supports three jump statements: break, continue and return
        // These statements transfer control to a different part of the program
        // Another way to change the program's flow or execution is through exception handling (supported by the keywords: try, catch, throw, throws and finally)
        // Exception handling provides a structured method to trap and handle run-time errors

        // BREAK STATEMENT
        // Has three uses:
        // 1. terminating a statement sequence in a switch statement
        // 2. To exit a loop (note: best to only use to cancel a loop when a special situation occurs as the loop's conditional expression is meant to stop the loop in normal fashion)
        // 3. For us as a form of 'goto' (as used in different programming languages, not java)

        System.out.println("Break statement in loop");
        for (a = 0; a < 6; a++) { // a for loop is used in this example, but it can just as well be a while loop to break out from
            if (a == 5) break;
            System.out.println("a now is: " + a);
        }
        System.out.println();

        // Break statement in nested loop
        // By using break, quick termination of a loop is forced, bypassing the conditional expression and any remaining code in the body of the loop.
        // Once a break statement is executed inside a loop, the loop is terminated and program control resumes at the next statement following the loop.
        // I.e. as shown in this example, only a break in loop b is used, meaning break will only break from loop b. Loop a will continue.
        // It is however to use multiple breaks: loop a could have a break statement as well.
        System.out.println("Break statement in nested loop");
        for (a = 0; a < 4; a++) {
            System.out.println("Loop a: " + a);
            for (b = 0; b < 3; b++) {
                System.out.println("b now is: " + b);
                if (b == 2) break; // Here, break will only break the current loop, of b. The a loop will continue.
            }
        }
        System.out.println();

        // Using break as a form of 'goto"
        // Goto as used in other programming languages performs a one-way transfer of control to another line of code.
        // This in contrast to a function call, which normally returns control.
        // Code with goto's can be more difficult to understand/follow and difficult to maintain. It also prohibits certain compiler optimizations.
        // However, goto can be useful for example when existing from a deeply nested set of loops.
        // For such purposes, Java offers an extended form of the break statement, with the addition of a label.
        // The label is typically used to identify a block of code. When the break executes, control is transferred out of the labeled block.
        System.out.println("Using break as a form of 'goto', with use of a label");
        check = false;
        labelone: {
            labeltwo:
            {
                labelthree:
                {
                    System.out.println("This line is executed before the break");
                    if (check) break labeltwo; // break out of second block of code by referring to the label
                    System.out.println("This line won't execute");
                }
                System.out.println("This line won't execute either");
            }
            System.out.println("This line is executed after the break (of the 'labeltwo' block of code) \n");
        }

        System.out.println("Using break to break from a for loop, with use of a label");
        outerloop: for(a=0; a<5; a++) { // a for loop labeled with the label 'outerloop'
            System.out.print("Pass " + a + ": ");
            for (b=0; b<10; b++) {
                if (b==5) break outerloop; // exit both loops as it kills the outerloop
                System.out.print(b + " ");
            }
            System.out.println("This line won't execute");
        }
        System.out.println();
        System.out.println("Completed the loop \n");

        // The statement 'continue' is used to force an early iteration of a loop, rather than stopping one.
        // In a while and do-while loop, continue causes control to be transferred directly to the conditional expression that controls the loop.
        // In a for loop, control goes first ot the iteration portion of the for statement and then to the conditional expression.
        // Similar to the break statement, continue can be used with a label, to direct the program to continue at a certain enclosing loop
        System.out.println("Using continue, with a label");
        outerloop: for (a=0; a<5; a++) { // for loop with label 'outerloop'
            for (b=0; b<5; b++) {
                if (b > a) {
                    System.out.println();
                    continue outerloop; // jumping out of the loop, continuing at outloop
                }
                System.out.print(" " + (a * b));
            }
            System.out.println();
        }

    }
}