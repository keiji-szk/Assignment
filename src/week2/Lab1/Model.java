package week2.Lab1;


/**
 * Model class
 *
 * @author Keiji Suzuki
 */
public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private Boolean canTravel;
    private Boolean smokes;

    /**
     * Default Constructor
     */
    public Model() {
        this("", "", 0, 0.0, false, false);
    }

    /**
     * Constructor: Set all data fields
     *
     * @param firstName String
     * @param lastName  String
     * @param height    int
     * @param weight    double
     * @param canTravel Boolean
     * @param smokes    Boolean
     */
    public Model(String firstName, String lastName, int height, double weight, Boolean canTravel, Boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Constructor: Set data fields. canTravel and smokes will be true and false, respectively.
     *
     * @param firstName String
     * @param lastName  String
     * @param height    int. The unit is inches
     * @param weight    double. The unit is pounds
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName, lastName, height, weight, true, false);
    }

    /**
     * Display model's details
     */
    public void displayModelDetails() {
        printDetails();
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }

    /**
     * Get Model's per-hour rate
     *
     * @return Model's per-hour rate (dollars / hour)
     */
    public int calculatePayDollarsPerHour() {
        int wage = BASE_RATE_DOLLARS_PER_HOUR;
        wage += (TALL_INCHES <= getHeight() && getWeight() < THIN_POUNDS) ?
                TALL_THIN_BONUS_DOLLARS_PER_HOUR : 0;
        wage += getCanTravel() ? TRAVEL_BONUS_DOLLARS_PER_HOUR : 0;
        wage -= getSmokes() ? SMOKER_DEDUCTION_DOLLARS_PER_HOUR : 0;
        return wage;
    }

    /**
     * Print its name, height, weight, can travel and can some.
     */
    public void printDetails() {
        String output = "Name: " + getFirstName() + " " + getLastName() +
                "\nHeight: " + getHeight() + " inches" +
                "\nWeight: " + Math.round(getWeight()) + " pounds";
        output += getCanTravel() ? "\nDoes travel" : "\nDoes not travel";
        output += getSmokes() ? "\nDoes smoke" : "\nDoes not smoke";
        System.out.println(output);
    }

    /**
     * Get Height in Feet and inches
     * e.g. "5 feet 1 inch",or "5 feet 6 inches"
     *
     * @return String
     */
    public String getHeightInFeetAndInches() {
        int ft = height / INCHES_PER_FOOT;
        int ic = height % INCHES_PER_FOOT;
        String icUnit = (ic <= 1) ? "inch" : "inches";
        return String.format("%d feet %d %s", ft, ic, icUnit);
    }

    /**
     * Get Wight in kg
     *
     * @return long
     */
    public long getWeightKg() {
        return Math.round(weight / POUNDS_PER_KG);
    }

    /**
     * Get first name.
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name.
     *
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name.
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name.
     *
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get height (inches).
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set height (inches).
     *
     * @param inches int. The unit is inches.
     */
    public void setHeight(int inches) {
        this.height = inches;
    }

    /**
     * Set height (feet and inches)
     *
     * @param feet   int
     * @param inches int
     */
    public void setHeight(int feet, int inches) {
        this.height = feet * INCHES_PER_FOOT + inches;
    }


    /**
     * Get weight (pounds).
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set weight (pounds).
     *
     * @param pounds double
     */
    public void setWeight(double pounds) {
        this.weight = pounds;
    }

    /**
     * Set weight (kg).
     *
     * @param kilograms long
     */
    public void setWeight(long kilograms) {
        this.weight = kilograms * POUNDS_PER_KG;
    }

    /**
     * Get canTravel.
     *
     * @return canTravel
     */
    public Boolean getCanTravel() {
        return canTravel;
    }

    /**
     * Set canTravel.
     *
     * @param canTravel bool
     */
    public void setCanTravel(Boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Get smokes.
     *
     * @return smokes
     */
    public Boolean getSmokes() {
        return smokes;
    }

    /**
     * Set smokes.
     *
     * @param smokes bool
     */
    public void setSmokes(Boolean smokes) {
        this.smokes = smokes;
    }
}
