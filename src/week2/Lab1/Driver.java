package week2.Lab1;

public class Driver {
    public static void main(String[] args) {
        Model mFatShortTravelSmoke = new Model("Ann", "Halfsaway", 66, 140, true, true);
        Model mThinTallTravelSmoke = new Model("Bob", "Wolf", 67, 139, true, true);
        Model mFatTallNonTravelNonSmoke = new Model("Chris", "Yamada", 68, 141, false, false);

        mFatShortTravelSmoke.displayModelDetails();
        System.out.println("-------------");
        mThinTallTravelSmoke.displayModelDetails();
        System.out.println("-------------");
        mFatTallNonTravelNonSmoke.displayModelDetails();
        System.out.println("-------------");

        mFatShortTravelSmoke.setHeight(5, 13);
        mFatShortTravelSmoke.setWeight(89);
        mFatShortTravelSmoke.displayModelDetails();
        System.out.println("-------------");
        System.out.println(mFatShortTravelSmoke.getHeightInFeetAndInches());
        System.out.println("-------------");
        System.out.println(mFatShortTravelSmoke.getWeight());
        System.out.println(mFatShortTravelSmoke.getWeightKg());
    }
}
