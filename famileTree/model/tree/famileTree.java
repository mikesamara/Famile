package famileTree.model.service;

import famileTree.model.Human.comparators.comparatorsByLastName;
import famileTree.model.Human.comparators.comparatorsGender;
import famileTree.model.tree.FamilyTreeItem;
import famileTree.model.tree.PersomIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class famileTree<E extends FamilyTreeItem<E>> implements Serializable, Iterable<E> {
    private ArrayList<E> personList;

    public famileTree(ArrayList<E> personList) {
        this.personList = personList;
    }
    public famileTree(){
        this(new ArrayList<>());
    }

    public void addPerson(E person) {
        personList.add(person);
    }

    public String getInfoPerson() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Генеалогическим древо:" + "\n");
        for (E person : personList) {
            stringBuilder.append(person);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    @Override
    public Iterator<E> iterator() {

        return new PersomIterator(personList);
    }
    public void sortByGender(){
        personList.sort(new comparatorsGender());
    }
    public void sortByLastName(){
        personList.sort(new comparatorsByLastName());
    }


}