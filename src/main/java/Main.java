import model.City;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/file.csv";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()){
            City city = parseLine(scanner.nextLine());
            System.out.println(city);
        }
        scanner.close();
    }

    private static City parseLine(String line) {
        String region = null;
        int number = 0;
        String name = null;
        String district = null;
        int population = 0;
        String foundation;
        try {
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter("\\s*;\\s*");
            number = Integer.parseInt(scanner.next());
            name = scanner.next();
            region = scanner.next();
            district = scanner.next();
            population = Integer.parseInt(scanner.next());
            foundation = scanner.next();
        } catch (NoSuchElementException e) {
            foundation = "";
        }
        return new City(number, name, region, district, population, foundation);
    }
}
