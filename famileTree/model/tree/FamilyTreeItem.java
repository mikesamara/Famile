package famileTree.model.tree;

import famileTree.model.Human.Gender;

import java.io.Serializable;
import java.time.LocalDate;

public interface FamilyTreeItem<T> extends Serializable {

    LocalDate getBirthday();
    LocalDate getDeath();
    String getFistName();
    String getLastName();
    Gender getGender();



}
