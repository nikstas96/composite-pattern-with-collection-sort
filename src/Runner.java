import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Employee> ceo = new ArrayList<>();
        Employee CEO = new Employee(1, "Gail", "Martin", 39);
        ceo.add(CEO);

        List<Employee> headsOfDepartments = new ArrayList<>();
        Employee headOfItDepartment = new Employee(4, "Oliver", "Reynolds", 31);
        Employee headOfFinanceDepartment = new Employee(3, "Julia", "Watts", 29);
        Employee headOfSaleDepartment = new Employee(8, "Herman", "Hammond", 24);
        headsOfDepartments.add(headOfItDepartment);
        headsOfDepartments.add(headOfFinanceDepartment);
        headsOfDepartments.add(headOfSaleDepartment);

        List<Employee>itWorkers = new ArrayList<>();
        Employee itDepartmentWorker = new Employee(9, "Clinton", "Frazier", 23);
        Employee itDepartmentWorker1 = new Employee(10, "Judith", "Manning", 26);
        itWorkers.add(itDepartmentWorker);
        itWorkers.add(itDepartmentWorker1);

        List<Employee>financeWorkers = new ArrayList<>();
        Employee financeDepartmentWorker=new Employee(2, "Bruce", "Gross", 33);
        Employee financeDepartmentWorker1=new Employee(12, "Herman", "Hammond", 41);
        financeWorkers.add(financeDepartmentWorker);
        financeWorkers.add(financeDepartmentWorker1);

        List<Employee>saleWorkers = new ArrayList<>();
        Employee saleDepartmentWorker=new Employee(14, "Rachel", "Perez", 27);
        Employee saleDepartmentWorker1=new Employee(5, "James", "Bowen", 26);
        saleWorkers.add(saleDepartmentWorker);
        saleWorkers.add(saleDepartmentWorker1);

        headsOfDepartments.addAll(itWorkers);
        headsOfDepartments.addAll(financeWorkers);
        headsOfDepartments.addAll(saleWorkers);

        ceo.addAll(headsOfDepartments);

        Collections.sort(ceo,Employee.Comparators.SORT_BY_AGE);
        for (Employee employee:ceo) {
            System.out.println(employee);
        }

        System.out.println("_______________________________________________________");
        Collections.sort(ceo,Employee.Comparators.SORT_BY_ID);
        for (Employee employee:ceo) {
            System.out.println(employee);
        }

        System.out.println("_______________________________________________________");
        Collections.sort(ceo,Employee.Comparators.SORT_BY_NAME_AND_AGE);
        for (Employee employee:ceo) {
            System.out.println(employee);
        }
    }
}
