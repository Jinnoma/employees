import java.util.*;

public class Registry {

    private final List<Employee> employees = new ArrayList<>();

    public Registry() {
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public int getRegistryLen() {
        return employees.size();
    }

    public void removeEmployee(int employeeId) {
        ArrayList<Employee> toRemove = new ArrayList<>();
        for (Employee emp : employees) {
            if (employeeId == emp.getId()) {
                toRemove.add(emp);
            }
        }
        employees.removeAll(toRemove);
    }

    public ArrayList<String> getEmployeesByCity(String city) {
        ArrayList<String> empCity = new ArrayList<>();
        for (Employee emp : employees) {
            if (city.equals(emp.getCity())) {
                empCity.add(emp.getFirstName() + " " + emp.getLastName());
            }
        }
        return empCity;
    }

    public ArrayList<String> getEmployeesWithCorpValue() {
        ArrayList<String> employeesWithCorpValue = new ArrayList<>();
        for (Employee emp : employees) {
            employeesWithCorpValue.add(emp.getFirstName() + " " + emp.getLastName() + ", corporation Value: " + emp.getCorporationValue());
        }
        return employeesWithCorpValue;
    }


    public List<String> sortEmployees(){
        ArrayList<String> sortedEmployees = new ArrayList<>();
        employees.sort(Comparator.comparing(Employee::getExperience).reversed());
        for (Employee emp : employees){
            sortedEmployees.add(emp.getFirstName() + " " + emp.getLastName() + ", Experience: " + emp.getExperience());
        }
        employees.sort(Comparator.comparing(Employee::getAge));
        for (Employee emp : employees){
            sortedEmployees.add(emp.getFirstName() + " " + emp.getLastName() + ", Age: " + emp.getAge());
        }
        employees.sort(Comparator.comparing(Employee::getLastName));
        for (Employee emp : employees){
            sortedEmployees.add(emp.getFirstName() + " " + emp.getLastName() + ", Name: " + emp.getLastName());
        }
        return sortedEmployees;
    }
}



