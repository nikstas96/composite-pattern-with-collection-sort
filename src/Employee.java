import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee employee) {
        return Comparators.SORT_BY_NAME.compare(this, employee);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "| Surname: " + this.getSurname()
                + "| Age: " + this.getAge() + "| Id: " + this.getId();
    }
    public static class Comparators {

        public static Comparator<Employee> SORT_BY_NAME = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee1) {
                return employee.getName().compareTo(employee1.getName());
            }
        };

        public static Comparator<Employee> SORT_BY_SURNAME = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee1) {
                return employee.getSurname().compareTo(employee1.getSurname());
            }
        };

        public static Comparator<Employee> SORT_BY_AGE = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee1) {
                return employee.getAge() - employee1.getAge();
            }
        };

        public static Comparator<Employee> SORT_BY_ID = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee1) {
                return employee.getId() - employee1.getId();
            }
        };

        public static Comparator<Employee> SORT_BY_NAME_AND_AGE = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee employee1) {
                int i = employee.getName().compareTo(employee1.getName());
                if (i == 0) {
                    i = employee.getAge() - employee1.getAge();
                }
                return i;
            }
        };
    }
}
