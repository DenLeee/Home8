import java.io.Serializable;

public class HalfLife implements Serializable {
    int level;
    String location;
    Person person;

    public HalfLife(int level, String location, Person person) {
        this.level = level;
        this.location = location;
        this.person = person;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
