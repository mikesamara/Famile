package ru.gb.famileTree;

import ru.gb.famileTree.Person.Research;
import ru.gb.famileTree.Person.famileTree;
import ru.gb.famileTree.Person.Person;

public class main {
    public static void main(String[] args) {
        famileTree famileTree = new famileTree();
        Person person1 = new Person("Самарчук","Иван","27.02.1971");
        Person person2 = new Person("Самарчук","Людмила","01.01.1976");
        Person person3 = new Person("Самарчук","Алексей","23.07.1993");
        Person person4 = new Person("Самарчук","Михаил","23.11.1998");
        Research fg = new Research();

        famileTree.addPerson(person1);
        famileTree.addPerson(person2);
        famileTree.addPerson(person3);
        famileTree.addPerson(person4);

        fg.appendVifeHusbent(person2, person1);
        fg.appendPerentChild(person1,person3);
        fg.appendPerentChild(person2,person3);
        fg.appendPerentChild(person1,person4);
        fg.appendPerentChild(person2,person4);

        System.out.println(famileTree.getInfoPerson());

    }
}
