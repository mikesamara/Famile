package famileTree.Human;

import famileTree.Human.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersomIterator implements Iterator<Person> {
    private  int index;
    private ArrayList<Person> personList;

    public PersomIterator (List<Person> personList){
        this.personList = (ArrayList<Person>) personList;
    }

    @Override
    public boolean hasNext() {
        return index < personList.size();
    }

    @Override
    public Person next() {
        return personList.get(index++);
    }
}
