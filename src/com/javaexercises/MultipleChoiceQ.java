package com.javaexercises;

import java.util.Scanner;

public class MultipleChoiceQ {
    public static void main(String[] args) {
        System.out.println("Hey there!");
        System.out.println(" ");

        String question = "What is Ben's lastname in Ben 10?";
        String choiceOne = "citizen";
        String choiceTwo = "tennyson";
        String choiceThree = "copeland";

        String correctAnswer = choiceTwo;

        Scanner input = new Scanner(System.in);
        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("(A) " + choiceOne);
        System.out.println("(B) " + choiceTwo);
        System.out.println("(C) " + choiceThree);
        System.out.println(" ");

        // Have the user input an answer
        System.out.println("Your answer: ");
        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        if (correctAnswer.equals(userInput.toLowerCase())) {
            // then the user is correct, and we want to print out a congrats message to the user.
            System.out.println("Congrats you are correct! The answer is " + correctAnswer);
        } // If the user's input does not match the correctAnswer...
        else {
            // then the user is incorrect, and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("You are incorrect, the correct answer is " + correctAnswer);
        }


    }
}
