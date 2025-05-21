package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        //build an ArrayList of Person
        ArrayList<Person> miFamilia = new ArrayList<Person>();

        //add family members
        miFamilia.add(new Person("Avery", "Gamez", 1));
        miFamilia.add(new Person("Claudia", "Gomez", 44));
        miFamilia.add(new Person("Guadalupe", "Ramirez", 50));
        miFamilia.add(new Person("Blue", "Ramirez", 6));
        miFamilia.add(new Person("Jasmin", "Ramirez", 24));
        miFamilia.add(new Person("Benji", "Ramirez", 7));
        miFamilia.add(new Person("Vanessa", "Ramirez", 23));
        miFamilia.add(new Person("Ozzy", "Ramirez", 2));
        miFamilia.add(new Person("Veronica", "Zamarripa", 13));

        //sort the list by last name and display the results
        Collections.sort(miFamilia);

        //header with formatting
        System.out.println("\t\t\t╔═══════════════════════╗");
        System.out.println("\t\t\t║     Mi Familia \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67     ║");
        System.out.println("\t\t\t╚═══════════════════════╝");
        System.out.printf("🧍 %-15s 🧍 %-15s 🎂 %s\n", "First Name", "Last Name", "Age");
        System.out.println("════════════════════════════════════════════════════════");

        //loop over the list and formatting
        for (Person people : miFamilia) {
            System.out.printf("   %-15s    %-15s    %3d\n", people.getFirstName(), people.getLastName(), people.getAge());
        }
    }
}