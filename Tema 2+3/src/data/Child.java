package data;

import common.Constants;
import enums.Category;
import enums.Cities;
import enums.ElvesType;

import java.util.ArrayList;

public class Child {
    private Integer id;
    private String lastName;
    private String firstName;
    private Integer age;
    private Cities city;
    private Double niceScore;
    private Double niceScoreBonus;
    private ArrayList<Category> giftsPreferences;
    private ArrayList<Double> scoreList = new ArrayList<>();
    private Double buget = 0.0;
    private ArrayList<Gift> gifts = new ArrayList<>();
    private ElvesType elf;


    public Child(final Integer id, final String lastName, final String firstName,
                 final Integer age, final Cities city, final Double niceScore,
                 final ArrayList<Category> giftsPreferences, final ArrayList<Double> scoreList,
                 final Double buget, final ArrayList<Gift> gifts) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.city = city;
        this.niceScore = niceScore;
        this.giftsPreferences = giftsPreferences;
        this.scoreList = scoreList;
        this.buget = buget;
        this.gifts = gifts;
    }

    public Child() {

    }

    /**
     * metoda care adauga scorul nou in lista de scoruri
     */
    public void score() {
        if (niceScore == null) {
            return;
        }
        if (scoreList.size() == 0) {
            scoreList.add(niceScore);
            setScoreList(scoreList);
        } else {
            for (int i = 0; i < scoreList.size(); i++) {
                if (scoreList.get(i) == niceScore) {
                    return;
                }
            }
            scoreList.add(niceScore);
            setScoreList(scoreList);
        }
    }

    /**
     * metoda care calculeaza scorul mediu al copilului
     * @return
     */
    public Double averageScore() {

        double sum = 0.0;

        if (this.age < Constants.BABY) {
            sum = Constants.MAX_SCORE;
        } else {
            if (this.age < Constants.KID) {

                for (int i = 0; i < scoreList.size(); i++) {
                    sum = sum + scoreList.get(i);
                }
                sum = sum / scoreList.size();

            } else if (this.age <= Constants.TEEN) {
                int sumk = 0;

                for (int i = 0; i < scoreList.size(); i++) {
                    sum = sum + scoreList.get(i) * (i + 1);
                    sumk +=  (i + 1);
                }
                sum = sum / sumk;

            }
        }
        if (niceScoreBonus != null) {
            sum += (sum * niceScoreBonus) / Constants.ONE_HUNDRED;
        }
        if (sum > Constants.MAX_SCORE) {
            sum = Constants.MAX_SCORE;
        }
        return sum;
    }

    /**
     * metoda care calculeaza bugetul alocat copilului
     * @param budgetUnit
     */
    public void computeBudget(final double budgetUnit) {
        double bugetPerChild;

        bugetPerChild = averageScore() * budgetUnit;

        if (ElvesType.BLACK == elf) {
            bugetPerChild = bugetPerChild - (bugetPerChild * Constants.THIRTY)
                    / Constants.ONE_HUNDRED;
        } else if (elf == ElvesType.PINK) {
            bugetPerChild = bugetPerChild + (bugetPerChild * Constants.THIRTY)
                    / Constants.ONE_HUNDRED;
        }
        this.buget = bugetPerChild;
    }

    /**
     * imbatrineste un copil din lista cu n ani
     * @param years
     */
    public void incrementAge(final int years) {
        this.age = this.age + years;
    }

    /**
     * getter pentru gifts in care se retine lista de cadouri a copilului
     * @return
     */
    public ArrayList<Gift> getGifts() {
        return gifts;
    }

    /**
     * setter pentru gifts in care se retine lista de cadouri a copilului
     * @param gifts
     */
    public void setGifts(final ArrayList<Gift> gifts) {
        this.gifts = gifts;
    }

    /**
     * getter petru budget in care se retine bugetul alocat  copilului
     * @return
     */
    public Double getBudget() {
        return buget;
    }

    /**
     * getter petru id in care se retine id-ul copilului
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter petru id in care se retine id-ul copilului
     * @param id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * getter petru firstName in care se retine numele de familie al copilului
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter petru firstName in care se reine numele de familie al copilului
     * @param lastName
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter petru firstName in care se retine prenumele copilului
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter petru firstName in care se retine prenumele copilului
     * @param firstName
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter pentru age in care se retine varsta copilului
     * @return
     */
    public Integer getAge() {
        return age;
    }

    /**
     * setter pentru age in care se retine varsta copilului
     * @param age
     */
    public void setAge(final Integer age) {
        this.age = age;
    }

    /**
     * getter pentru city in care se retine orasul din care provine copilului
     * @return
     */
    public Cities getCity() {
        return city;
    }

    /**
     * setter pentru city in care se retine orasul din care provine copilului
     * @param city
     */
    public void setCity(final Cities city) {
        this.city = city;
    }

    /**
     * getter pentru niceScore in care se retine scorul copilului
     * @return
     */
    public Double getNiceScore() {
        return niceScore;
    }

    /**
     * setter pentru niceScore in care se retine scorul copilului
     * @param niceScore
     */
    public void setNiceScore(final Double niceScore) {
        this.niceScore = niceScore;
    }

    /**
     * getter pentru lista giftsPreferences in care se retin toate preferintele copilului
     * @return
     */
    public ArrayList<Category> getGiftsPreferences() {
        return giftsPreferences;
    }

    /**
     * setter pentru lista giftsPreferences in care se retin toate preferintele copilului
     * @param giftsPreferences
     */
    public void setGiftsPreferences(final ArrayList<Category> giftsPreferences) {
        this.giftsPreferences = giftsPreferences;
    }

    /**
     * getter pentru lista scoreList in care se retin toate scorurile copilului
     * @return
     */
    public ArrayList<Double> getscoreList() {
        return scoreList;
    }

    /**
     * setter pentru lista scoreList in care se retin toate scorurile copilului
     * @param scoreList
     */
    public void setScoreList(final ArrayList<Double> scoreList) {
        this.scoreList = scoreList;
    }

    /**
     * getter pentru niceScoreBonus in care se retine bosusul de cumintiene al copilului
     * @return
     */
    public Double getNiceScoreBonus() {
        return niceScoreBonus;
    }

    /**
     * setter pentru niceScoreBonus in care se retine bosusul de cumintiene al copilului
     * @param niceScoreBonus
     */
    public void setNiceScoreBonus(final Double niceScoreBonus) {
        this.niceScoreBonus = niceScoreBonus;
    }

    /**
     * getter pentru elf in care se retine tipul de elf al copilului
     * @return
     */
    public ElvesType getElf() {
        return elf;
    }

    /**
     * setter pentru elf in care se retine tipul de elf al copilului
     * @param elf
     */
    public void setElf(final ElvesType elf) {
        this.elf = elf;
    }

    /**
     * metoda toString pentru afisarea continutului clasei Child
     * @return
     */
    @Override
    public String toString() {
        return "Child{"
                + "id=" + id
                + ", niceScore='" + niceScore + '\''
                + ", lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", age=" + age
                + ", city=" + city
                + ", niceScore=" + niceScore
                + ", giftsPreferences=" + giftsPreferences
                + ", scoreList=" + scoreList
                + ", buget=" + buget
                + ", elf=" + elf
                + '}';
    }

}
