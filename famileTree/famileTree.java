package famileTree;

import java.io.Serializable;
import java.util.ArrayList;

public class famileTree implements Serializable {
    private ArrayList<Person> personList;

    public famileTree() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public String getInfoPerson() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Генеалогическим древо:" + "\n");
        for (Person person : personList) {
            stringBuilder.append(person);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}