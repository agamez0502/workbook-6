package com.pluralsight;

import java.util.Collections;

public class Person /*implements Comparable<Person>*/ {

    //properties
    private String firstName;
    private String lastName;
    private int age;

    //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //methods

//    //method to sort by last name/first name/age
//    @Override
//    public int compareTo(Person otherPerson) {
//        //if statement for last name comparison - if they are not equal sort by last name
//        int lastNameComparison = this.lastName.compareToIgnoreCase(otherPerson.lastName);
//        if (lastNameComparison != 0) {
//            return lastNameComparison;
//        }
//
//        //if statement for first name comparison - if last names are the same sort by first name
//        int firstNameComparison = this.firstName.compareToIgnoreCase(otherPerson.firstName);
//        if (firstNameComparison != 0) {
//            return firstNameComparison;
//        }
//
//        //if last name and first name are the same then sort by age
//        return Integer.compare(this.age, otherPerson.age);
//    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}