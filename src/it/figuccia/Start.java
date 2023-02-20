package it.figuccia;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
