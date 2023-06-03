import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Николай", "Римский-Корсаков", 14));
        persons.add(new Person("Василий", "Лебедев-Кумач", 51));
        persons.add(new Person("Лев", "Толстой", 82));
        persons.add(new Person("Александр", "Барклай-де-Толли-Веймарн", 10));
        persons.add(new Person("Александр", "Бреверн-де-Лагарди", 90));

        persons.removeIf(person -> person.getAge() < 18);
        persons.forEach(System.out::println);
    }
}