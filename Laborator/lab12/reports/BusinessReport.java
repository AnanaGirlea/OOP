package lab12.reports;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import lab12.entities.*;

public class BusinessReport {

    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        // Get employees and map them on the type of disability they possess
        Map<Disability, List<Employee>> map = business.getEmployees().stream().collect(Collectors.groupingBy(Employee::getDisability));

        return map;
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count
       long nr = business.getEmployees().stream().filter(employee -> employee.getGender().equals(Gender.FEMALE)).
               flatMap(employee -> employee.getProjects().stream()).distinct().count();

        return nr;
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        // Map the employees by religion (Map<Religion, List<Employee>>) then map each of the lists by city (Map<String, List<Employee>>)
        // Hint: use Collectors.groupingBy(Function, Collector)
        Map<Religion, Map<Gender, List<Employee>>> map =  business.getEmployees().stream().collect(
                Collectors.groupingBy(Employee::getReligion, Collectors.groupingBy(Employee::getGender)));

        return map;
    }
}
