package homework7;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class ToFile {
    private Formatter file;

    public void openFile() {
        try {
            file = new Formatter("c:homework7.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи информации о товарах на складе создать не получилось");
        }
    }

    public void addRecord(int x1, int x2, Product x3) {
        file.format("%s\t%s\t%s\n", (x1 + 1), x2, x3);
    }

    public void closeFile() {
        file.close();
    }
}

