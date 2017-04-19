package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userSelection;

        int[] studentNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        String[] studentName = {"Leah", "Stephanie", "Mike", "Saritha", "Lydia", "Megan", "Trina", "Sean", "Jeremy", "Nick",
                "Allie", "Sarah", "Peter", "Marin"};

        String[] favFood = {"pizza", "sushi", "Mexican", "Italian", "ice cream", "cake", "pizza", "sushi", "Mexican", "Italian",
                "ice cream", "cake", "pizza", "sushi"};

        String[] favAnimal = {"dog", "cat", "horse", "lion", "tiger", "bear", "dolphin", "dog", "cat", "horse", "lion", "tiger", "bear", "dolphin"};

        String userWants;

        String keepGoing = "yes";


        System.out.println("Welcome to Java, April 2017 class!: ");
        do {
            System.out.println("Enter a student's number to find out more about them (1-14):");

            userSelection = scan.nextInt();
            try {

                System.out.println("Student " + userSelection + " is " + studentName[userSelection - 1] + ".");

                System.out.println("What would you like to know about " + studentName[userSelection - 1] + "? Enter 'favorite food' or 'favorite animal'.");
                scan.nextLine();
                userWants = scan.nextLine().toLowerCase();
                do {

                    if (userWants.contains("food")) {
                        System.out.println(studentName[userSelection - 1] + "'s favorite food is " + favFood[userSelection - 1] + ".");
                        break;
                    } else if (userWants.contains("animal")) {
                        System.out.println(studentName[userSelection - 1] + "'s favorite animal is a " + favAnimal[userSelection - 1] + ".");
                        break;
                    } else {
                        System.out.println("You did not enter a valid selection. Please try again: ");
                        userWants = scan.nextLine().toLowerCase();
                    }
                } while (userWants.contains("food") || (userWants.contains("animal")));

                System.out.println("Would you like to learn about another student? Enter yes or no: ");
                keepGoing = scan.nextLine().toLowerCase();
            }  catch(IndexOutOfBoundsException e){
                System.out.println("You did not enter a valid student number.");
            }

        } while (keepGoing.equalsIgnoreCase("yes"));
        System.out.println("Thanks for learning more about us!");
        //NEED TO ADD CATCH EXCEPTION SO THAT IF ENTER INVALID STUDENT NUMBER IT STARTS OVER

    }
}

//if (heightParam < 0) {
//        throw new Exception("Invalid height.");
//        }
//        return heightParam;