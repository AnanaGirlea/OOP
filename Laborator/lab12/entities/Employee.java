package lab12.entities;

import java.util.*;

public class Employee {
    private final String name;
    private final Integer age;
    private final String city;
    private Gender gender;
    private Disability disability;
    private Religion religion;
    private final Set<Account> accounts = new HashSet<>();
    private final List<Project> projects = new ArrayList<>();

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Employee(String name, Integer age, String city, Gender gender, Disability disability, Religion religion) {
        this(name, age, city);
        this.gender = gender;
        this.disability = disability;
        this.religion = religion;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public String getName() {
		return name;
	}

	public String getCity() {
		return city;
    }
    
    public Integer getAge() {
		return age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Disability getDisability() {
		return disability;
    }
    
    public Religion getReligion() {
		return religion;
	}
	
	public Set<Account> getAccounts() {
        // TODO: get an immutable set of data - DONE
        return Collections.unmodifiableSet(accounts);
    }
	
	public List<Project> getProjects() {
        // TODO: get an immutable list of data - DONE
        return List.copyOf(projects);
    }
    
    @Override
	public String toString() {
		StringBuilder res = new StringBuilder();
        res.append("Name ")
            .append(getName())
            .append(", city ")
            .append(getCity())
            .append(", age ")
            .append(getAge())
            .append(", gender ")
            .append(getGender())
            .append(", religion ")
            .append(getReligion())
            .append("\n");

		return res.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return getName().equals(employee.getName()) &&
            getGender() == employee.getGender() &&
            getCity().equals(employee.getCity()) &&
            getAge() == employee.getAge();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getGender(), getCity(), getAge());
	}
}
