package famileTree;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        famileTree famileTree = new famileTree();
        FileHandler fileHandler = new FileHandler();
        famileTree.addPerson(new Person("Самарчук", "Иван", Gender.men,
                LocalDate.of(1971,02,25), null,  "Отец", null));
        famileTree.addPerson(new Person("Самарчук", "Людмила", Gender.women, LocalDate.of(1976,01,01),
        null, "мать", null));
        famileTree.addPerson(new Person("Самарчук", "Алексей", Gender.men, LocalDate.of(1993,07,23),
                null, null, "сын"));
        famileTree.addPerson(new Person("Самарчук", "Михаил", Gender.men, LocalDate.of(1998,11,23),
                null, null, "сын"));


        System.out.println(famileTree.getInfoPerson());


        fileHandler.save(famileTree, "C:/Users/Alexey/famile/famileTree/FamileTree.out");

//        FileHandler fileHandler = new FileHandler();
//        famileTree FamileTree = (famileTree) fileHandler.read("C:/Users/Alexey/famile/famileTree/FamileTree.out");
//        System.out.println(FamileTree);


    }
}
