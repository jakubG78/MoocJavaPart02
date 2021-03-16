
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
                    .map(parts -> new LiteracyEntry(parts[0], ageGroup, gender, country, 0, 0))
                    .forEach(t -> System.out.println(t));
        } catch (IOException e) {
        
            System.out.println("Error: " + e.getMessage());
        }

//        String string = "Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513";
//        String[] pieces = string.split(",");
//        // now pieces[0] equals "Adult literacy rate"
//        // pieces[1] equals " population 15+ years"
//        // etc.
//
//        // to remove whitespace, use the trim() method:
//        pieces[2] = pieces[2].split(" ")[1].trim();
//        System.out.println(pieces[2]);
    }
}
