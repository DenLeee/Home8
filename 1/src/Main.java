import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person joker = new Person("JOKER", "STALKER");

        HalfLife halfLife3 = new HalfLife(10,"UnderGround", joker);

        save(halfLife3);

        HalfLife hlLoad = load();
        System.out.printf("Прогресс загрузился на урове %d, локация %s, персонаж %s",hlLoad.level, hlLoad.location, hlLoad.person.name);
    }


    public static void save (HalfLife halfLife) {
        try (FileOutputStream fos = new FileOutputStream("joker.hl3");
             ObjectOutputStream oos = new ObjectOutputStream(fos) ) {
            oos.writeObject(halfLife);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static HalfLife load () {
        try (FileInputStream fis = new FileInputStream("joker.hl3");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (HalfLife) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }
}
