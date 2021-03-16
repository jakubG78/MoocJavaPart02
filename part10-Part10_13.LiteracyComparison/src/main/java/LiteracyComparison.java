
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyEntry> literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .map(parts -> new LiteracyEntry(parts[2].split(" ")[1].trim(), parts[3].trim(),
                    Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .forEach(entry -> literacyList.add(entry));
        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
                       
        for (LiteracyEntry entry : literacyList) {
            System.out.println(entry.toString());
        }
    }
}
