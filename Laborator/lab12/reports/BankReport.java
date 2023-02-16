package lab12.reports;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lab12.entities.*;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        long nr = bank.getClients().stream().mapToLong(aa -> aa.getEmployees().size()).sum();

        return (int) nr;
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        long nr =  bank.getClients().stream().flatMap(aa -> aa.getEmployees().stream()).
                mapToLong(bb -> bb.getAccounts().size()).sum();

        return (int) nr;
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order
        SortedSet<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getName));

        bank.getClients().stream().map(Business::getEmployees).forEach(employees::addAll);

        return employees;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        double sum = bank.getClients().stream().flatMap(aa -> aa.getEmployees().stream()).
                flatMap(bb -> bb.getAccounts().stream()).mapToDouble(Account::getBalance).sum();

        return sum;
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        TreeSet<Account> accounts = new TreeSet<>(Comparator.comparing(Account::getBalance).thenComparing(Account::getId));

        accounts.addAll(bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).
                flatMap(employee -> employee.getAccounts().stream()).collect(Collectors.toSet()));

        return accounts;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts
        Map<Employee, Collection<Account>> map = new HashMap<>();

        bank.getClients().forEach(e -> e.getEmployees().forEach(a -> map.put(a, a.getAccounts())));

        return map;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities
        Map<String, List<Employee>> map = bank.getClients().stream().flatMap(client -> client.getEmployees().
                stream()).collect(Collectors.groupingBy(Employee::getCity));

        return map;
    }
}
