
public class FamilyApp {
    public static void main(String[] args) {
        // TODO: Create objects and start while loop

        DataLoader data = new DataLoader("tudor.dat");
        FamilyManager fm = new FamilyManager(data.getPersonList());
        data.setRelations(fm);
        while (true) {
            // get user input
            // if quit break
            String name = "";
            Person p = fm.findPerson(name);
            if (p != null) {
                System.out.println(p);
            } else {
                System.out.printf("Unknown person : %s\n", name);
            }
        }
    }
}