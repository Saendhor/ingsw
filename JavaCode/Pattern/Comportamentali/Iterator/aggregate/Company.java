package Iterator.aggregate;

import Iterator.iterator.Employee;
import Iterator.iterator.EmployeeIterator;
import Iterator.iterator.Iterator;

import java.util.*;

/* ConcreteAggregate */
public class Company implements Aggregate<Employee> {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}