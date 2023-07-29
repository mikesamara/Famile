package famileTree.model.Human.comparators;

import famileTree.model.tree.FamilyTreeItem;

import java.util.Comparator;

public class comparatorsGender <E extends FamilyTreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2){
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
