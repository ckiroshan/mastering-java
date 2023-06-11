package com.javabasics;

import java.util.Scanner;

@SuppressWarnings({"ConstantConditions", "RedundantSuppression", "DuplicateBranchesInSwitch", "EnhancedSwitchMigration"})
public class SwitchStatements {
    public static void main(String[] args) {
//        Switch statements,
//        int number = 28;
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();

        switch (name) {
            //            (name) => refers to variable you pass from user input
            case "Bryan": // If name == "Bryan", following gets printed.
                System.out.println("Hi, " + name);
                break;  // This will stop the switch execution
            // Only if above statement is true.
            case "Kane":
                System.out.println("Hi, " + name);
                break;
            case "Hunter":
                System.out.println("Hi, " + name);
                break;
            case "Shawn":
                System.out.println("Hi, " + name);
                break;
            case "Kaushik":
                System.out.println("Hi, " + name);
                break;
            case "Iroshan":
                System.out.println("Hi, " + name);
                break;

            default:
                System.out.println("Hey " + name + "! We couldn't find your name on our system :(");
        }

//        A simpler method of a switch statement.
        switch (name) {
            case "Bryan", "Kane", "Hunter", "Shawn", "Kaushik", "Iroshan" -> System.out.println("Hi, " + name);
            default -> System.out.println("Sorry, your name is not in the system");
        }
        
    }
}
