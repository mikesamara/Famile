package famileTree;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String fistName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private LocalDate death;

    private String parents;
    private String children;

    public Person(String fistName, String lastName, Gender gender, LocalDate birthday, LocalDate death,
                  String parents, String children) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.death = death;
        this.children = children;
        this.parents = parents;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
    }

    public LocalDate getDeath() {
        return death;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "fistName: " + fistName +
                ", lastName: " + lastName +
                ", birthday: " + birthday +
                ", parents: " + parents +
                ", children: " + children+
                ", death: " + death;
    }
}
