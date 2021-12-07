import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String skill;

    public Person(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }
}
