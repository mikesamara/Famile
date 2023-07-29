package famileTree.model.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersomIterator<E> implements Iterator<E> {
    private  int index;
    private ArrayList<E> personList;

    public PersomIterator (List<E> personList){
        this.personList = (ArrayList<E>) personList;
    }

    @Override
    public boolean hasNext() {
        return index < personList.size();
    }

    @Override
    public E next() {
        return personList.get(index++);
    }
}
