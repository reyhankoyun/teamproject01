import java.util.ArrayList;

public class DataLoader {
    private String inputFileName;
    public DataLoader(String fileName) {
        this.inputFileName = fileName;
    }

    public ArrayList<Person> getPersonList() {
        ArrayList<Person> result = new ArrayList<>();

        //TODO: Read persons from input file and create Person objects and add to array list

        return result;
    }

    public void setRelations(FamilyManager familyManager) {
        //TODO: Read relation part from input file and set mother, father and children for each person
        String name = "";
        String fatherName = "";
        String motherName = "";
        Person person = familyManager.findPerson(name);
        Person mother = familyManager.findPerson(name);
        Person father = familyManager.findPerson(name);

        // Check null
        person.setMother(mother);
        person.setFather(father);
        mother.addChild(person);
        father.addChild(person);


    }
}