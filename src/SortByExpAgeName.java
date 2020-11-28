import java.util.Comparator;

public class SortByExpAgeName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int c;
        c = o2.getExperience() - (o1.getExperience());
        if (c == 0)
            c = o1.getAge() - o2.getAge();
        if (c == 0)
            c = o1.getLastName().compareTo(o2.getLastName());
        return c;
    }
}
