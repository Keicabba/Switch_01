package it.figuccia;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;
        while (wantContinue) {
            System.out.print("Please enter a number between 1 and 10: ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                switch (number) {
                    case 1:
                        System.out.println("This number name is: One");
                        break;
                    case 2:
                        System.out.println("This number name is: Two");
                        break;
                    case 3:
                        System.out.println("This number name is: Tre");
                        break;
                    case 4:
                        System.out.println("This number name is: Four");
                        break;
                    case 5:
                        System.out.println("This number name is: Five");
                        break;
                    case 6:
                        System.out.println("This number name is: Six");
                        break;
                    case 7:
                        System.out.println("This number name is: Seven");
                        break;
                    case 8:
                        System.out.println("This number name is: Eight");
                        break;
                    case 9:
                        System.out.println("This number name is: Nine");
                        break;
                    case 10:
                        System.out.println("This number name is: Ten");
                        break;
                    default:
                        System.out.println("Cannot give you the name");
                        break;
                }
            } catch (NumberFormatException e) {
                switch (input){
                    case "exit":
                        wantContinue = !(input.equals("exit"));
                        System.out.println("Exiting from program");
                        break;
                    default:
                        System.out.println("Is not a number, retry");
                        break;
                }
            }
        }
    }
}


/* L'ho modificato attenendomi al testo. anche se lo trovo un po' troppo forzato uno switch dove può andare un array.

        String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        while (true) {
            System.out.print("Please enter a number between 1 and 10: ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if (number >= 1 && number <= 10) {
                    System.out.println(names[number - 1]);
                } else {
                    System.out.println("Cannot give you the name");
                }
            } catch (NumberFormatException e) {
                System.out.println("Is not a number, retry");
            }
        }
        */
