package ru.gb.famileTree.Person;

import java.util.ArrayList;

public class Research {
    private ArrayList<Research> researchArrayList;

    public Research() {
        researchArrayList  = new ArrayList<>();
    }

    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();


    // связь родитель - ребенок
    public void appendPerentChild(Person parent, Person children) {
        researchArrayList.add(new Node(parent, Relationship.parent, children));
        researchArrayList.get(new Node(children, Relationship.children, parent));
    }
    // связь муж - жена
    public void appendVifeHusbent(Person vife, Person husbent) {
        researchArrayList.add(new Node(vife, Relationship.vife, husbent));
        researchArrayList.add(new Node(husbent, Relationship.husbent, vife));
    }
}


