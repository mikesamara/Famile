package famileTree.Human.comparators;

import famileTree.Human.Person;

import java.util.Comparator;
import java.util.Iterator;

public class comparatorsLastName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2){
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
