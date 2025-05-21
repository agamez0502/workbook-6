package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        //build an ArrayList of Person
        ArrayList<Person> miFamilia = new ArrayList<Person>();

        //add family members
        miFamilia.add(new Person("Alondra", "Gamez", 29));
        miFamilia.add(new Person("Alondra", "Gamez", 21));
        miFamilia.add(new Person("Avery", "Gamez", 1));
        miFamilia.add(new Person("Claudia", "Gomez", 44));
        miFamilia.add(new Person("Guadalupe", "Ramirez", 50));
        miFamilia.add(new Person("Blue", "Ramirez", 6));
        miFamilia.add(new Person("Jasmin", "Ramirez", 24));
        miFamilia.add(new Person("Benji", "Ramirez", 7));
        miFamilia.add(new Person("Vanessa", "Ramirez", 23));
        miFamilia.add(new Person("Ozzy", "Ramirez", 2));
        miFamilia.add(new Person("Veronica", "Zamarripa", 13));

        //sorting with a lambda
//        miFamilia.sort((p1, p2) -> {
//            //if statement for last name comparison - if they are not equal sort by last name
//            int lastNameComparison = p1.getLastName().compareToIgnoreCase(p2.getLastName());
//            if (lastNameComparison != 0) {
//                return lastNameComparison;
//            }
//
//            //if statement for first name comparison - if last names are the same sort by first name
//            int firstNameComparison = p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
//            if (firstNameComparison != 0) {
//                return firstNameComparison;
//            }
//
//            //if last name and first name are the same then sort by age
//            return Integer.compare(p1.getAge(), p2.getAge());
//        });

        //sort the list by last name and display the results
        Collections.sort(miFamilia);

        //header with formatting
        System.out.println("\t\t\t╔═══════════════════════╗");
        System.out.println("\t\t\t║     Mi Familia \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67     ║");
        System.out.println("\t\t\t╚═══════════════════════╝");
        System.out.printf("🧍 %-15s 🧍 %-15s 🎂 %s\n", "First Name", "Last Name", "Age");
        System.out.println("════════════════════════════════════════════════════════");

        //loop over the list and formatting
        //miFamilia.forEach({});
        for (Person people : miFamilia) {
            System.out.printf("   %-15s    %-15s    %3d\n", people.getFirstName(), people.getLastName(), people.getAge());
        }
    }
}