package ru.gb.famileTree.Person;

public class Person {
    private String fistName;
    private String lastName;
    private String birthay;


    public Person(String fistName, String lastName, String birthay) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthay = birthay;

    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthay() {
        return birthay;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthay(String birthay) {
        this.birthay = birthay;
    }

    @Override
    public String toString() {
        return "fistName: " + fistName + ", lastName: " + lastName + ", birthey: " + birthay;
    }
}
