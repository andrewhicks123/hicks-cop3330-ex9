/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length? ");
        double l = input.nextInt();
        System.out.print("What is the width? ");
        double w = input.nextInt();
        System.out.print("You will need to purchase " + (int) Math.ceil((l * w) / 350) + " gallons of paint to cover " + (int)(l * w) + " square feet");
    }
}
