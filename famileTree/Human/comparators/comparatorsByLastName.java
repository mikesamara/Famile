package famileTree.Human.comparators;

import famileTree.Human.Person;

import java.util.Comparator;

public class comparatorsByLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
