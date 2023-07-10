package ru.gb.famileTree.Person;

import ru.gb.famileTree.Person.Person;
import ru.gb.famileTree.Person.Relationship;

public class Node {
    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }
    Person p1;
    Relationship re;
    Person p2;
    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

}

