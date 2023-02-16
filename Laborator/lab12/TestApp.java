package lab12;

import lab12.entities.*;
import lab12.exceptions.ExistsException;
import lab12.reports.BankReport;
import lab12.reports.BusinessReport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestApp {
    private Bank bank;
    private Business business1;
    private Business business2;

    @BeforeEach
    private void setup() throws ExistsException {
        bank = new Bank();
        business1 = new Business();
        business2 = new Business();

        modifyBank(bank, business1, business2);
    }

    private void modifyBank(Bank bank, Business business1, Business business2) throws ExistsException {
        // Businesses
        bank.addClient(business1);
        bank.addClient(business2);

        // Employees
        Employee e1 = new Employee("Rajesh", 29, "Jaipur", Gender.MALE, Disability.DISABLED, Religion.BUDDHISM);
        Employee e2 = new Employee("Abdul", 22, "Mumbai", Gender.MALE, Disability.HEALTHY, Religion.BUDDHISM);
        Employee e3 = new Employee("Arjun", 20, "Ahmedabad", Gender.FEMALE, Disability.HEALTHY, Religion.BUDDHISM);
        Employee e4 = new Employee("Brijesh", 39, "Mumbai", Gender.MALE, Disability.DISABLED, Religion.BUDDHISM);
        Employee e5 = new Employee("Darsh", 49, "Delhi", Gender.MALE, Disability.DISABLED, Religion.CHRISTIANITY);
        Employee e6 = new Employee("Ekaraj", 32, "Mumbai", Gender.FEMALE, Disability.HEALTHY, Religion.CHRISTIANITY);
        Employee e7 = new Employee("Fariq", 25, "Delhi", Gender.MALE, Disability.DISABLED, Religion.CHRISTIANITY);
        Employee e8 = new Employee("Girik", 50, "Delhi", Gender.FEMALE, Disability.HEALTHY, Religion.CHRISTIANITY);
        Employee e9 = new Employee("Gunbir", 56, "Jaipur", Gender.FEMALE, Disability.DISABLED, Religion.CHRISTIANITY);
        Employee e10 = new Employee("Hitesh", 23, "Mumbai", Gender.MALE, Disability.HEALTHY, Religion.CALVINISM);
        Employee e11 = new Employee("Jagdish", 46, "Bangalore", Gender.MALE, Disability.HEALTHY, Religion.CALVINISM);
        Employee e12 = new Employee("Jairaj", 58, "Mumbai", Gender.FEMALE, Disability.DISABLED, Religion.DAOISM);
        Employee e13 = new Employee("Kabir", 42, "Delhi", Gender.MALE, Disability.HEALTHY, Religion.DAOISM);
        Employee e14 = new Employee("Krishna", 34, "Ahmedabad", Gender.FEMALE, Disability.DISABLED, Religion.DAOISM);
        Employee e15 = new Employee("Mitesh", 18, "Mumbai", Gender.MALE, Disability.ANONYMOUS, Religion.HINDUISM);
        Employee e16 = new Employee("Naveen", 27, "Bangalore", Gender.FEMALE, Disability.HEALTHY, Religion.HINDUISM);
        Employee e17 = new Employee("Onkar", 37, "Ahmedabad", Gender.FEMALE, Disability.ANONYMOUS, Religion.ISLAM);
        Employee e18 = new Employee("Praneel", 49, "Bangalore", Gender.MALE, Disability.ANONYMOUS, Religion.ISLAM);
        Employee e19 = new Employee("Ranveer", 52, "Mumbai", Gender.MALE, Disability.DISABLED, Religion.ISLAM);

        // Projects
        Project p1 = new Project("Bender Project", 6);
        Project p2 = new Project("Hornets", 10);
        Project p3 = new Project("Westerners", 12);
        Project p4 = new Project("Whistler", 24);
        Project p5 = new Project("Coding Region", 3);
        Project p6 = new Project("The Blue Bird", 7);
        Project p7 = new Project("Fast Ball", 14);
        Project p8 = new Project("Mercury", 60);
        Project p9 = new Project("Limitless Horizons", 8);
        Project p10 = new Project("Strive Training", 8);
        Project p11 = new Project("Yaeger", 8);
        Project p12 = new Project("Yoda", 20);
        Project p13 = new Project("Meetup for the God", 26);
        Project p14 = new Project("Next Gala", 36);
        Project p15 = new Project("Sirius", 6);
        Project p16 = new Project("Sputnik", 6);
        Project p17 = new Project("Stratos", 8);
        Project p18 = new Project("Revolution", 10);
        Project p19 = new Project("Red Butter", 3);
        Project p20 = new Project("Rhinestone", 7);
        Project p21 = new Project("Linkage", 14);
        Project p22 = new Project("Excalibur", 6);
        Project p23 = new Project("Wombat", 6);
        Project p24 = new Project("Indie", 12);
        Project p25 = new Project("The Art of Codes", 26);
        Project p26 = new Project("Annual Award Show", 36);
        Project p27 = new Project("Robust Routine", 6);
        Project p28 = new Project("Wide Stringer", 6);
        Project p29 = new Project("Static Startup", 6);

        // Accounts
        Account a1 = new Account(1, 200, 10);
        Account a2 = new Account(2, 900, 10);
        Account a3 = new Account(3, 900, 10);
        Account a4 = new Account(4, 1600, 10);
        Account a5 = new Account(5, 1600, 10);
        Account a6 = new Account(6, 1600, 10);
        Account a7 = new Account(7, 2000, 10);
        Account a8 = new Account(8, 2000, 10);
        Account a9 = new Account(9, 2000, 10);
        Account a10 = new Account(10, 3000, 20);
        Account a11 = new Account(11, 4000, 20);
        Account a12 = new Account(12, 4000, 20);
        Account a13 = new Account(13, 4000, 20);
        Account a14 = new Account(14, 5000, 20);
        Account a15 = new Account(15, 5000, 20);
        Account a16 = new Account(16, 5000, 20);
        Account a17 = new Account(17, 7000, 30);
        Account a18 = new Account(18, 7000, 30);
        Account a19 = new Account(19, 9000, 30);
        Account a20 = new Account(20, 9000, 30);
        Account a21 = new Account(21, 9000, 30);
        Account a22 = new Account(22, 9400, 30);
        Account a23 = new Account(23, 9400, 30);
        Account a24 = new Account(24, 9400, 50);
        Account a25 = new Account(25, 9400, 50);
        Account a26 = new Account(26, 9400, 50);
        Account a27 = new Account(27, 10000, 50);
        Account a28 = new Account(28, 20000, 100);
        Account a29 = new Account(29, 20500, 100);
        Account a30 = new Account(30, 30000, 300);

        // Pair employees - accounts
        e1.addAccount(a1);
        e2.addAccount(a2);
        e3.addAccount(a3);
        e4.addAccount(a4);
        e5.addAccount(a5);
        e6.addAccount(a6);
        e7.addAccount(a7);
        e8.addAccount(a8);
        e9.addAccount(a9);
        e10.addAccount(a10);
        e11.addAccount(a11);
        e12.addAccount(a12);
        e13.addAccount(a13);
        e14.addAccount(a14);
        e15.addAccount(a15);
        e16.addAccount(a16);
        e17.addAccount(a17);
        e18.addAccount(a18);
        e19.addAccount(a19);
        e10.addAccount(a20);
        e1.addAccount(a21);
        e12.addAccount(a22);
        e3.addAccount(a23);
        e4.addAccount(a24);
        e15.addAccount(a25);
        e6.addAccount(a26);
        e7.addAccount(a27);
        e8.addAccount(a28);
        e19.addAccount(a29);
        e10.addAccount(a30);

        // Pair employees - projects
        e1.addProject(p1);
        e2.addProject(p2);
        e3.addProject(p3);
        e4.addProject(p4);
        e5.addProject(p5);
        e6.addProject(p6);
        e7.addProject(p7);
        e8.addProject(p8);
        e9.addProject(p9);
        e10.addProject(p10);
        e11.addProject(p11);
        e12.addProject(p12);
        e13.addProject(p13);
        e14.addProject(p14);
        e15.addProject(p15);
        e16.addProject(p16);
        e17.addProject(p17);
        e18.addProject(p18);
        e19.addProject(p19);
        e10.addProject(p20);
        e1.addProject(p21);
        e12.addProject(p22);
        e3.addProject(p23);
        e4.addProject(p24);
        e15.addProject(p25);
        e6.addProject(p26);
        e7.addProject(p27);
        e8.addProject(p28);
        e19.addProject(p29);
        e10.addProject(p29);
        e10.addProject(p10);
        e11.addProject(p11);
        e12.addProject(p2);
        e13.addProject(p3);
        e14.addProject(p4);
        e15.addProject(p5);
        e16.addProject(p6);
        e17.addProject(p7);
        e18.addProject(p8);
        e19.addProject(p9);
        e10.addProject(p20);
        e1.addProject(p21);
        e12.addProject(p22);
        e3.addProject(p13);
        e4.addProject(p14);
        e15.addProject(p15);
        e6.addProject(p16);
        e7.addProject(p17);
        e8.addProject(p18);
        e19.addProject(p19);
        e10.addProject(p20);
        e1.addProject(p11);
        e2.addProject(p21);
        e3.addProject(p13);
        e4.addProject(p14);
        e5.addProject(p15);
        e6.addProject(p16);
        e7.addProject(p17);
        e8.addProject(p18);
        e9.addProject(p19);
        e10.addProject(p12);
        e11.addProject(p12);
        e12.addProject(p17);
        e13.addProject(p12);
        e14.addProject(p12);
        e15.addProject(p12);
        e16.addProject(p12);
        e17.addProject(p12);
        e18.addProject(p12);
        e19.addProject(p12);
        e10.addProject(p2);
        e1.addProject(p14);
        e12.addProject(p26);

        // Pair Businesses - projects
        business1.addProject(p1);
        business1.addProject(p2);
        business1.addProject(p3);
        business1.addProject(p4);
        business1.addProject(p5);
        business1.addProject(p6);
        business1.addProject(p7);
        business1.addProject(p8);
        business1.addProject(p9);
        business1.addProject(p10);
        business1.addProject(p11);
        business1.addProject(p12);
        business1.addProject(p13);
        business1.addProject(p14);
        business1.addProject(p15);
        business1.addProject(p16);
        business1.addProject(p17);
        business1.addProject(p18);
        business2.addProject(p19);
        business2.addProject(p20);
        business2.addProject(p21);
        business2.addProject(p22);
        business2.addProject(p23);
        business2.addProject(p24);
        business2.addProject(p25);
        business2.addProject(p26);
        business2.addProject(p27);
        business2.addProject(p28);
        business2.addProject(p29);

        // Pair Businesses - employees
        business1.addEmployee(e1);
        business1.addEmployee(e2);
        business1.addEmployee(e3);
        business1.addEmployee(e4);
        business1.addEmployee(e5);
        business1.addEmployee(e6);
        business1.addEmployee(e7);
        business1.addEmployee(e8);
        business1.addEmployee(e9);
        business1.addEmployee(e10);
        business1.addEmployee(e11);
        business1.addEmployee(e12);
        business2.addEmployee(e13);
        business2.addEmployee(e14);
        business2.addEmployee(e15);
        business2.addEmployee(e16);
        business2.addEmployee(e17);
        business2.addEmployee(e18);
        business2.addEmployee(e19);
    }

    @Test
    public void testGetNumberOfCustomers() {
        var customers = BankReport.getNumberOfCustomers(bank);
        Assertions.assertEquals(19, customers);
    }

    @Test
    public void testGetNumberOfAccounts() {
        var accounts = BankReport.getNumberOfAccounts(bank);
        Assertions.assertEquals(30, accounts);
    }

    @Test
    public void testGetCustomersSorted() {
        var customers = BankReport.getCustomersSorted(bank);
        SortedSet<Employee> actualCustomers = new TreeSet<>(Comparator.comparing(Employee::getName));
        assert customers != null;
        Assertions.assertFalse(customers.isEmpty());
        Assertions.assertEquals(19, customers.size());
    }

    @Test
    public void testGetTotalSumInAccounts() {
        var sum = BankReport.getTotalSumInAccounts(bank);
        Assertions.assertEquals(211300.0, sum);
    }

    @Test
    public void testGetAccountsSortedBySum() {
        var accounts = BankReport.getAccountsSortedBySum(bank);
        assert accounts != null;
        Assertions.assertEquals(30, accounts.size());
    }

    @Test
    public void testGetCustomerAccounts() {
        var accounts = BankReport.getCustomerAccounts(bank);
        assert accounts != null;
        Assertions.assertEquals(19, accounts.size());
    }

    @Test
    public void testGetCustomersByCity() {
        var customers = BankReport.getCustomersByCity(bank);
        assert customers != null;
        Assertions.assertEquals(5, customers.size());
    }

    @Test
    public void testGetEmployeesOnSameDisability() {
        var employees = BusinessReport.getEmployeesOnSameDisability(business2);
        Assertions.assertEquals(3, employees.size());
        Assertions.assertEquals(3, employees.get(Disability.ANONYMOUS).size());
        Assertions.assertEquals(2, employees.get(Disability.HEALTHY).size());
        Assertions.assertEquals(2, employees.get(Disability.DISABLED).size());
    }

    @Test
    public void testGetNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees() {
        var projects = BusinessReport.getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(business1);
        Assertions.assertEquals(15, projects);
    }

    @Test
    public void testGetEmployeesOnSameReligionAndGender() {
        var employees = BusinessReport.getEmployeesOnSameReligionAndGender(business1);
        assert employees != null;
        Assertions.assertEquals(4, employees.size());
        Assertions.assertEquals(2, employees.get(Religion.BUDDHISM).size());
        Assertions.assertEquals(2, employees.get(Religion.CHRISTIANITY).size());
        Assertions.assertEquals(1, employees.get(Religion.DAOISM).size());
        Assertions.assertEquals(1, employees.get(Religion.CALVINISM).size());
        Assertions.assertNull(employees.get(Religion.ISLAM));
        Assertions.assertNull(employees.get(Religion.HINDUISM));
    }

    @AfterEach
    private void clean() {
        bank = null;
        business1 = null;
        business2 = null;
    }
}
