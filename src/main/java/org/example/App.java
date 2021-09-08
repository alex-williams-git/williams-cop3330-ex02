/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.print("What is the input string? ");

        Scanner scan = new Scanner(System.in);
        String input_string = scan.nextLine();

        int string_length = input_string.length();

        System.out.println(input_string + " has " + string_length + " characters.");
    }
}
