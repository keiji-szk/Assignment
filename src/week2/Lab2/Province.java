package week2.Lab2;

public class Province {
    static private final long MINIMUM_POPULATION = 30000;
    static private final long MAXIMUM_POPULATION = 15000000;

    static public final long POPULATION_AB = 4262635;
    static public final long POPULATION_BC = 4648055;
    static public final long POPULATION_MB = 1342153;
    static public final long POPULATION_NB = 775610;
    static public final long POPULATION_NL = 510550;
    static public final long POPULATION_NS = 969383;
    static public final long POPULATION_ON = 14223942;
    static public final long POPULATION_PE = 154331;
    static public final long POPULATION_QC = 8501833;
    static public final long POPULATION_SK = 1132505;

    static public final String PROVINCE_AB = "Alberta";
    static public final String PROVINCE_BC = "British Columbia";
    static public final String PROVINCE_MB = "Manitoba";
    static public final String PROVINCE_NB = "New Brunswick";
    static public final String PROVINCE_NL = "Newfoundland and Labrador";
    static public final String PROVINCE_NS = "Nova Scotia";
    static public final String PROVINCE_ON = "Ontario";
    static public final String PROVINCE_PE = "Prince Edward Island";
    static public final String PROVINCE_QC = "Quebec";
    static public final String PROVINCE_SK = "Saskatchewan";

    static public final String CAPITAL_AB = "Edmonton";
    static public final String CAPITAL_BC = "Victoria";
    static public final String CAPITAL_MB = "Winnipeg";
    static public final String CAPITAL_NB = "Fredericton";
    static public final String CAPITAL_NL = "St. John's";
    static public final String CAPITAL_NS = "Halifax";
    static public final String CAPITAL_ON = "Toronto";
    static public final String CAPITAL_PE = "Charlottetown";
    static public final String CAPITAL_QC = "Quebec City";
    static public final String CAPITAL_SK = "Regina";

    static public final String[][] PROVINCES_CITY_CANADA = {
            {PROVINCE_AB, CAPITAL_AB},
            {PROVINCE_BC, CAPITAL_BC},
            {PROVINCE_MB, CAPITAL_MB},
            {PROVINCE_NB, CAPITAL_NB},
            {PROVINCE_NL, CAPITAL_NL},
            {PROVINCE_NS, CAPITAL_NS},
            {PROVINCE_ON, CAPITAL_ON},
            {PROVINCE_PE, CAPITAL_PE},
            {PROVINCE_QC, CAPITAL_QC},
            {PROVINCE_SK, CAPITAL_SK}};

    private String name;
    private String capital;
    private long population;

    public Province() {
        SetDefaultValue();
    }

    public Province(String name, String capital, long population) {
        if (isValidProvince(name) &&
                isValidCapital(capital) &&
                isValidPopulation(population)) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            SetDefaultValue();
        }
    }

    public String getDetails() {
        return String.format("The capital of %s (population. %d) is %s",
                capital,
                population,
                name);
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setName(String name) {
        if (!isValidProvince(name))
            return;
        this.name = name;
    }

    public void setCapital(String capital) {
        if (!isValidCapital(capital))
            return;
        this.capital = capital;
    }

    public void setPopulation(long population) {
        if (!isValidPopulation(population))
            return;
        this.population = population;
    }

    private boolean isValidPopulation(long population) {
        return MINIMUM_POPULATION <= population &&
                population <= MAXIMUM_POPULATION;
    }

    private boolean isValidProvince(String province) {
        for (String[] elm : PROVINCES_CITY_CANADA) {
            if (elm[0].compareTo(province) == 0)
                return true;
        }
        return false;
    }

    private boolean isValidCapital(String capital) {
        for (String[] elm : PROVINCES_CITY_CANADA) {
            if (elm[1].compareTo(capital) == 0)
                return true;
        }
        return false;
    }

    private void SetDefaultValue() {
        this.population = POPULATION_BC;
        this.name = PROVINCE_BC;
        this.capital = CAPITAL_BC;
    }
}
