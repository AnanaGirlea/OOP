package data;

import enums.Category;
import enums.Cities;

import java.util.ArrayList;

public class OutputChild {
    private Integer id;
    private String lastName;
    private String firstName;
    private Cities city;
    private Integer age;
    private ArrayList<Category> giftsPreferences;
    private Double averageScore;
    private ArrayList<Double> niceScoreHistory;
    private Double assignedBudget;
    private ArrayList<Gift> receivedGifts;


    public OutputChild() {

    }

    public OutputChild(final Child child) {
        id = child.getId();
        lastName = child.getLastName();
        firstName = child.getFirstName();
        city = child.getCity();
        age = child.getAge();
        giftsPreferences = new ArrayList<>(child.getGiftsPreferences());
        averageScore = child.averageScore();

        niceScoreHistory = new ArrayList<>(child.getscoreList());
        assignedBudget = child.getBudget();
        receivedGifts = new ArrayList(child.getGifts());
    }


    /**
     * getter petru id in care se retine id-ul copilului
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter petru id in care se retine id-ul copilului
     *
     * @param id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * getter petru firstName in care se retine numele de familie al copilului
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter petru firstName in care se retine numele de familie al copilului
     *
     * @param lastName
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter petru firstName in care se retine prenumele copilului
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter petru firstName in care se retine prenumele copilului
     *
     * @param firstName
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter pentru city in care se retine orasul din care provine copilului
     *
     * @return
     */
    public Cities getCity() {
        return city;
    }

    /**
     * setter pentru city in care se retine orasul din care provine copilului
     *
     * @param city
     */
    public void setCity(final Cities city) {
        this.city = city;
    }

    /**
     * getter pentru age in care se retine varsta copilului
     *
     * @return
     */
    public Integer getAge() {
        return age;
    }

    /**
     * setter pentru age in care se retine varsta copilului
     *
     * @param age
     */
    public void setAge(final Integer age) {
        this.age = age;
    }

    /**
     * getter pentru lista giftsPreferences in care se retin toate preferintele copilului
     *
     * @return
     */
    public ArrayList<Category> getGiftsPreferences() {
        return giftsPreferences;
    }

    /**
     * setter pentru lista giftsPreferences in care se retin toate preferintele copilului
     *
     * @param giftsPreferences
     */
    public void setGiftsPreferences(final ArrayList<Category> giftsPreferences) {
        this.giftsPreferences = giftsPreferences;
    }

    /**
     * setter pentru averageScore in care se retine scorul mediu al copilului
     *
     * @return
     */
    public Double getAverageScore() {
        return averageScore;
    }

    /**
     * setter pentru averageScore in care se retine scorul mediu al copilului
     *
     * @param averageScore
     */
    public void setAverageScore(final Double averageScore) {
        this.averageScore = averageScore;
    }

    /**
     * getter pentru lista niceScoreHistory in care se retin toate scorurile copilului
     *
     * @return
     */
    public ArrayList<Double> getNiceScoreHistory() {
        return niceScoreHistory;
    }

    /**
     * setter pentru lista niceScoreHistory in care se retin toate scorurile copilului
     *
     * @param niceScoreHistory
     */
    public void setNiceScoreHistory(final ArrayList<Double> niceScoreHistory) {
        this.niceScoreHistory = niceScoreHistory;
    }

    /**
     * getter petru assignedBudget in care se retine bugetul alocat copilului
     *
     * @return
     */
    public Double getAssignedBudget() {
        return assignedBudget;
    }

    /**
     * setter petru assignedBudget in care se retine bugetul alocat copilului
     *
     * @param assignedBudget
     */
    public void setAssignedBudget(final Double assignedBudget) {
        this.assignedBudget = assignedBudget;
    }

    /**
     * getter pentru lista receivedGifts in care se retin toate cadourile primite de copil
     *
     * @return
     */
    public ArrayList<Gift> getReceivedGifts() {
        return receivedGifts;
    }

    /**
     * setter pentru lista receivedGifts in care se retin toate cadourile primite de copil
     *
     * @param receivedGifts
     */
    public void setReceivedGifts(final ArrayList<Gift> receivedGifts) {
        this.receivedGifts = receivedGifts;
    }

    /**
     * Metoda toString pentru afisarea continutului clasei OutputChild
     *
     * @return
     */
    @Override
    public String toString() {
        return "OutputChild{"
                + "id=" + id
                + ", lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", city=" + city
                + ", age=" + age
                + ", giftsPreferences=" + giftsPreferences
                + ", averageScore=" + averageScore
                + ", niceScoreHistory=" + niceScoreHistory
                + ", assignedBudget=" + assignedBudget
                + ", receivedGifts=" + receivedGifts
                + '}';
    }
}
