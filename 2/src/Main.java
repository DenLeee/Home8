import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Нужно ввести путь до файла и имя нового файла через пробел");
        }

        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1]) ) {
            int count;
            while ((count = fis.read()) != -1) {
                fos.write(count);
            }
            System.out.println("Файл успешно скопирован");
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл по заданому пути ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
