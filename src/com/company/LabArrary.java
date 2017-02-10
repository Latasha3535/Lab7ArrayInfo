package com.company;

import java.util.Scanner;

public class LabArrary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String students[] = {" Rome Cole", "Tina Marks ", "Crystal Richardson", "Eric Richardson", "Kim Weems", "  Elin Jones", "Laticia Paker ",
                "Cassandra Marks", "Esmeralda Willams", "Lizbeth Jackson", "Alvina Paul", "Kieth Leonard", "Damon Gregory", "Tyrell Hill",
                "Samual Jackson", "Erik Smith ", "Yuko Moto", " Syhia Marks", "Tasha Mack", " Valnessa Meeks"};

        int ages[] = {29, 25, 33, 29, 45, 81, 20, 33, 46, 3, 11, 15, 67, 80, 57, 56};

        String foods[] = {"hash browns", "coffee", "pine nuts", "turtle", "artificial sweetener", "quail", "black-eyed peas",
                "buckwheat", "Goji berry ", "capers", "cilantro", "blueberries", "cooking wine", "applesauce",
                "mushrooms", "dumpling", "marmalade", "bacon", "vanilla", "tonic water"};


        System.out.println("Welcome to our java class. Which student would you like to learn more about? (enter a number 1-20): ");
        int i = scan.nextInt();
        System.out.println(" ");


        int i2 = i - 1;
        String choices = " y";
        String answer = " ";

        do {


            if (i < 1 || i > 20) {

                System.out.print("That student does not exist. Please try again. (enter a number 1-20): ");
            } else {
                System.out.print("Student " + i + " is " + students[i2] + ". ");

                int position = students[i2].indexOf(" ");


                System.out.println("What would you like to know about " + students[i2].substring(0, position) + "? " );
                System.out.println(" ");
                System.out.println("Enter age  or favorite food:");
                answer = scan.next();
                System.out.println(" ");
                answer = answer.trim();


                while ((answer == "age") || (answer == "food")) {

                }
                if (answer.equals("age")) {
                    System.out.println(students[i2] + " is  " + ages[i2]);
                    System.out.println(" ");
                } else if (answer.equals("food")) {
                    System.out.println(students[i2] + " favorite food is " + foods[i2] + ".");
                    System.out.println(" ");
                } else if(!answer.equals("age")){
                    System.out.println("That data does not exist. Please try again.");
                }else if(!answer.equals("food")) {
                    System.out.println("That data does not exist. Please try again.");
                }else {
                    System.out.print( "Thank you");
                }



            }


              //if ( choices != "n") {
                    System.out.println("Would you like to know more? (enter y or n ): ");
                    choices = scan.next().toLowerCase();

              //  } else {
                    //System.out.println( "Thank you");
               //
            // }*/
        }while (choices.equals("y"));
    }
}



  // while (choices.equals("y"))









