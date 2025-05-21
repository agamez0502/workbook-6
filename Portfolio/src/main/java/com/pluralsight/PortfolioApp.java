package com.pluralsight;

import com.pluralsight.finance.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PortfolioApp {

    public static void main(String[] args) {

        //fire up scanner for user input
        Scanner portfolioScanner = new Scanner(System.in);

        //importing in portfolio class from finance package
        Portfolio portfolio = new Portfolio("Alondra's Portfolio", "Alondra");

        //welcome the user to the app
        System.out.println("Welcome to Alondra's Portfolio \uD83E\uDDFE");

        //display menu
        boolean appRunning = true;

        while(appRunning){
            //bonus: prompt users to add new assets to their portfolio
            //the app should prompt the user for the type of asset and all of it's values
            System.out.println("\nWhat type of asset would you like to add?");
            System.out.println("1) Bank Account 🏦");
            System.out.println("2) Credit Card 💳");
            System.out.println("3) Jewelry 💍");
            System.out.println("4) Gold 🪙");
            System.out.println("5) House 🏠");
            System.out.println("6) Exit");

            System.out.print("Make a selection: ");
            String choice = portfolioScanner.nextLine().trim();

            //use switch statement
        }
    }
}