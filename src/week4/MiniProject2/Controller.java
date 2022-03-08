package week4.MiniProject2;

import java.util.ArrayList;

public class Controller {
    static final int OPTION_SHOW_ALL = 1;
    static final int OPTION_ADD = 2;
    static final int OPTION_REMOVE = 3;
    static final int OPTION_UPDATE = 4;
    static final int OPTION_QUIT = 5;

    static final int MIN_OPTION_NUMBER = OPTION_SHOW_ALL;
    static final int MAX_OPTION_NUMBER = OPTION_QUIT;

    static final String OTHERINFO_WORK = "work";
    static final String OTHERINFO_HOME = "home";
    static final String OTHERINFO_CITY = "city";

    private ContactList cList;

    public Controller() {
        cList = new ContactList();
    }

    public void prepareDebugData() {
        Contact c1 = new Contact("Keiji Suzuki", "080-5587-1447");
        Contact c2 = new Contact("Hoge Huga", "080-5587097");
        Contact c3 = new Contact("Piyo", "778-769-7667");
        c2.updateOtherInfo(OTHERINFO_WORK, "Teacher");
        c2.updateOtherInfo(OTHERINFO_WORK, "Student");
        c3.updateOtherInfo(OTHERINFO_CITY, "Vancouver");
        c3.updateOtherInfo(OTHERINFO_HOME, "011-868-2287");
        cList.addContact(c1);
        cList.addContact(c2);
        cList.addContact(c3);
    }

    public void showAllContact() {
        int cntContact = 0;
        final ArrayList<Contact> contactArray = cList.getContactArray();
        if (contactArray.size() == 0) {
            System.out.println("No contact list.");
            return;
        }

        for (Contact elm : contactArray) {
            StringBuilder builder = new StringBuilder();
            builder.append(++cntContact + ". ");
            builder.append(elm.toString());
            System.out.println(builder.toString());
        }
    }

    private void getContact(Contact output) {
        String dispName = output.getName();
        String dispMobile = output.getMobile();
        String dispWork = output.getOtherInfo(OTHERINFO_WORK);
        String dispHome = output.getOtherInfo(OTHERINFO_HOME);
        String dispCity = output.getOtherInfo(OTHERINFO_CITY);

        String queryName = dispName.isEmpty() ? "Enter name:" : String.format("Enter name(%s):", dispName);
        String queryMobile = dispMobile.isEmpty() ? "Enter mobile:" : String.format("Enter mobile(%s):", dispName);
        String queryWork = dispWork.isEmpty() ? OTHERINFO_WORK + ":" : String.format("%s(%s):", OTHERINFO_WORK, dispWork);
        String queryHome = dispHome.isEmpty() ? OTHERINFO_HOME + ":" : String.format("%s(%s):", OTHERINFO_HOME, dispHome);
        String queryCity = dispCity.isEmpty() ? OTHERINFO_CITY + ":" : String.format("%s(%s):", OTHERINFO_CITY, dispCity);

        while (true) {
            String userInputName = InputCollector.getUserInput(queryName);
            if (userInputName.isEmpty()) {
                System.out.println("You must enter Name");
                continue;
            }
            output.setName(userInputName);
            break;
        }

        while (true) {
            String userInputMobile = InputCollector.getUserInput(queryMobile);
            if (userInputMobile.isEmpty()) {
                System.out.println("You must enter Mobile");
                continue;
            }
            output.setName(userInputMobile);
            break;
        }

        String work = InputCollector.getUserInput(queryWork);
        String home = InputCollector.getUserInput(queryHome);
        String city = InputCollector.getUserInput(queryCity);
        output.updateOtherInfo(OTHERINFO_WORK, work);
        output.updateOtherInfo(OTHERINFO_HOME, home);
        output.updateOtherInfo(OTHERINFO_CITY, city);
    }

    public void createNewContact() {
        Contact newContact = new Contact();
        getContact(newContact);
        if (!cList.addContact(newContact)) {
            System.out.println("This contact already existed.");
            return;
        }
        System.out.println("Successfully added a new contact!");
    }

    public void updateContact() {
        showAllContact();
        if (cList.getContactArray().size() <= 0)
            return;

        final int userIndex = queryUserSelectIndex("update");
        if (userIndex < 1) {
            return;
        }

        final ArrayList<Contact> cArray = cList.getContactArray();
        Contact elm = cArray.get(userIndex - 1);
        System.out.println(elm.toString());

        getContact(elm);
        if (!cList.updateContact(userIndex - 1, elm)) {
            System.out.println("This contact already existed.");
            return;
        }
        System.out.println("Successfully added a new contact!");
        System.out.println(elm.toString());
    }

    public void removeContact() {
        showAllContact();
        if (cList.getContactArray().size() <= 0)
            return;

        final int userIndex = queryUserSelectIndex("remove");
        if (userIndex < 1) {
            return;
        }

        cList.removeContact(userIndex - 1);
        System.out.println("Successfully removed the contact!");
    }

    public void showOptions() {
        System.out.println("\n+===  Contact  App  ===+");
        System.out.println(String.format("| %d. List all Contacts |", OPTION_SHOW_ALL));
        System.out.println(String.format("| %d. Add new Contacts  |", OPTION_ADD));
        System.out.println(String.format("| %d. Remove Contacts   |", OPTION_REMOVE));
        System.out.println(String.format("| %d. Update Contacts   |", OPTION_UPDATE));
        System.out.println(String.format("| %d. Quit              |", OPTION_QUIT));
        System.out.println("+=================== ===+");
    }

    public int convertToOptionNumber(String str) {
        String range = String.format("[%d-%d]", MIN_OPTION_NUMBER, MAX_OPTION_NUMBER);
        if (!str.matches(range)) {
            return -1;
        }
        return Integer.parseInt(str);
    }

    private int queryUserSelectIndex(String command) {
        final String strNum = InputCollector.getUserInput(String.format("Enter the index of the contact to %s:", command));
        final ArrayList<Contact> cArray = cList.getContactArray();
        final int numList = cArray.size();
        if (!strNum.matches(String.format("[1-%d]", numList))) {
            System.out.println(String.format("Enter number between 1 and %s.", numList));
            return -1;
        }
        return Integer.parseInt(strNum);
    }

    public static void main(String[] args) throws Exception {
        Controller ctrlr = new Controller();
        ctrlr.prepareDebugData();

        while (true) {
            ctrlr.showOptions();
            final String userInput = InputCollector.getUserInput("Enter your option:");

            final int selOption = ctrlr.convertToOptionNumber(userInput);
            if (selOption < 0) {
                System.out.println(String.format("Enter number from %d to %d.", MIN_OPTION_NUMBER, MAX_OPTION_NUMBER));
                continue;
            } else if (selOption == 1) {
                ctrlr.showAllContact();
            } else if (selOption == 2) {
                ctrlr.createNewContact();
            } else if (selOption == 3) {
                ctrlr.removeContact();
            } else if (selOption == 4) {
                ctrlr.updateContact();
            } else if (selOption == 5) {
                System.out.println("Bye!");
                return;
            } else {
                throw new Exception("Error! Not defined option");
            }
        }
    }
}
