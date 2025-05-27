package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //fire up the scanner for user input
        Scanner nameScanner = new Scanner(System.in);

        //create a list of at least 10 people
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Alondra", "Gamez", 29));
        people.add(new Person("Avery", "Gamez", 1));
        people.add(new Person("Claudia", "Gomez", 44));
        people.add(new Person("Guadalupe", "Ramirez", 50));
        people.add(new Person("Blue", "Ramirez", 6));
        people.add(new Person("Jasmin", "Ramirez", 24));
        people.add(new Person("Benji", "Ramirez", 7));
        people.add(new Person("Vanessa", "Ramirez", 23));
        people.add(new Person("Ozzy", "Ramirez", 2));
        people.add(new Person("Veronica", "Zamarripa", 13));
        people.add(new Person("Jacqueline", "Martinez", 31));
        people.add(new Person("Estefania", "Rodriguez", 31));
        people.add(new Person("Iman", "Penton", 27));
        people.add(new Person("Mikal", "Johnson", 28));

        //prompt the user for a name to search (first or last)
        System.out.print("Enter a first or last name to search: ");
        String nameSearch = nameScanner.nextLine().trim();

        //use a loop to create a new List of people whose name was a match
        List<Person> matches = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(nameSearch) ||
                    person.getLastName().equalsIgnoreCase(nameSearch)) {
                matches.add(person);
            }
        }

        //display the name of the people in that list
        System.out.println("\n\t\t\t\t\t Matches \uD83D\uDD0D\n");

        if (matches.isEmpty()) {
            System.out.println("No matched were found. ❌ ");
        } else {
            System.out.printf("\uD83D\uDC64 %-15s %-15s \uD83D\uDDD3\uFE0F %-5s\n", "First Name", "Last Name", "Age");
            System.out.println("═══════════════════════════════════════════════");

            for (Person person : matches) {
                System.out.printf("   %-15s %-15s %-5d\n", person.getFirstName(), person.getLastName(), person.getAge());
            }
        }

        //calculate the average age of all people in the og list
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge = totalAge + age;

            if (age > oldest) {
                oldest = age;
            }

            if (age < youngest) {
                youngest = age;
            }
        }

        double averageAge = (double) totalAge / people.size();

        //display the average age of all people in the list
        System.out.printf("\n\uD83D\uDCCA Average Age: %.2f\n", averageAge);

        //display the age of the oldest person in the list
        System.out.println("\uD83D\uDC74 Oldest Age:   " + oldest);

        //display the age of the youngest person in the list
        System.out.println("\uD83D\uDC76 Youngest Age: " + youngest);
    }
}