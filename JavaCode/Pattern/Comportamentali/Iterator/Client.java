package Iterator;

import java.util.ArrayList;
import java.util.List;

import Iterator.aggregate.Company;
import Iterator.iterator.Employee;
import Iterator.iterator.Iterator;

public class Client {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 70000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.getNext().getSalary();
        }

        System.out.println("Total salary: " + totalSalary);
    }
    
}
