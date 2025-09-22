// Ashesi Premier League
// Amy Ruth Doe Addo
// 22/09/2025
// Purpose: To enlist a player to the Ashesi Football team
// Practice  All concepts (variables, casting, increment/decrement, boolean logic,
//if/else, nested ifs, switch, fall-through, ternary)

import java.util.Scanner;                 // importing Scanner

public class PlayerSelection {
    public static void main(String[] args){
        String name;                       // Initialization of variables
        int age;
        float height;
        float weight;
        int jersey;
        String category = " ";
        String position = " ";
        String lineup = " " ;
        String eligibility;
        String attackerJersey;

        Scanner sc = new Scanner(System.in);                   // Receiving Input from the keyboard
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your Height: ");
        height = sc.nextFloat();
        System.out.print("Enter your weight: ");
        weight = sc.nextFloat();
        System.out.print("Enter your jersey number: ");
        jersey = sc.nextInt();


        int meter = 100;                                       // Conversion of certain variables
        double pound = 0.45359237;
        double kilogram_weight = pound * weight;
        double height_cm = height * meter;
        int converted_height = (int) height_cm;
        int converted_weight = (int) kilogram_weight;


        if (age < 18 || converted_weight > 90 || age > 35)           // checking eligibility
            eligibility = "Not eligible";
        else
            eligibility="Eligible";


        if (age < 20) {                                 // Determining category
            System.out.print("Rising Star");
            category = "Rising Star";
        }
        else if (age > 20 && age < 30) {
            category = "Prime Player";
        }
        else if (age > 30) {;
            category = "Veteran";
        }


        switch (jersey) {                                  // Assigning position based on jersey number
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                System.out.println("Player position not known");
                position = "Unknown";
                break;
        }
/*
        //Switch case 2 (Unwanted Fall-Through)
        switch (jersey) {
            case 1:
                System.out.println("Player is a goalkeeper");
                position = "Goalkeeper";
                break;
            case 2:
                System.out.println("Player is a defender");
                position = "Defender";
            case 6:
                System.out.println("Player is a midfielder");
                position = "Midfielder";
            case 7:
                System.out.println("Player is a winger");
                position = "Winger";
            case 9:
                System.out.println("Player is a striker");
                position = "Striker";
                break;
            case 10:
                System.out.println("Player is a playmaker");
                position = "Playmaker";
                break;
            case 11:
                System.out.println("Player is a winger");
                position = "Winger";
                break;
            case 5:
                System.out.println("Player is a defender");
                position = "Defender";
                break;
            case 8:
                System.out.println("Player is a midfielder");
                position = "Midfielder";
                break;
            default:
                System.out.println("Player position not known");
                position = "Unknown";
                break;
        }
*/

        if (jersey == 7 || jersey == 9 || jersey == 11 || jersey == 10) {
            attackerJersey = "Yes";
        }                                                //Checking to see if jersey is an attacker jersey
        else
            attackerJersey = "No";

        if (category == "Prime Player") {            // Determining the lineup
            if (converted_weight < 80) {
                lineup = "Starting Lineup";
            }
        }
        else
            lineup = "Go to the bench";



        String finalDecision = ((age < 18) || (age > 35) || (weight > 90)) ? "Play" : "Rest"; // final decision check


        System.out.println();                        // Displaying results
        System.out.println("Player Report");
        System.out.println("Player Name: " + name);
        System.out.println("Player Age: " + age + "("+category+")");
        System.out.println("Player Height: " + converted_height+"cm");
        System.out.println("Player Weight: " + converted_weight+"kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " + attackerJersey);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineup);
        System.out.println("Final Decision: " + finalDecision);


    }
}
