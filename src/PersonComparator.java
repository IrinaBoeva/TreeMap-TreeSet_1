import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (selectedSurname(o1) < selectedSurname(o2)) {
            return -1;
        }
        if (selectedSurname(o1) > selectedSurname(o2)) {
            return 1;
        }
        return o1.getAge() - o2.getAge();
    }

    private int selectedSurname(Person person) {
        String surname = person.getSurname();
        return surname.split("-").length;
    }
}
