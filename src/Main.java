import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Николай", "Римский-Корсаков", 64));
        persons.add(new Person("Василий", "Лебедев-Кумач", 51));
        persons.add(new Person("Лев", "Толстой", 82));
        persons.add(new Person("Александр", "Барклай-де-Толли-Веймарн", 80));
        persons.add(new Person("Александр", "Бреверн-де-Лагарди", 90));
        Collections.sort(persons, new PersonComparator());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}