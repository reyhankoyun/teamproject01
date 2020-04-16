import java.util.ArrayList;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    private Person father = null;
    private Person mother = null;
    private ArrayList<Person> children = new ArrayList<>();
    
    @Override
    public String toString() {
        //TODO: implement output here 
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }
}