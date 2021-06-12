package com.pbe;

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
    public static void main(String[] args) {

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
                        System.out.println("Switch a - Switch b - case 1");
                        break;
                    case 2:
                        System.out.println("Switch a - Switch b - case 2");
                        break;
                    case 3:
                        System.out.println("Switch a - Switch b - case 3");
                        break;
                }
                break; // break needed to end this nested switch! or case 2 will be executed as well and then break
            case 2:
                System.out.println("Switch a - case 2");
                break;
            case 3:
                System.out.println("Switch a - case 3");
                break;
        }

    }
}
