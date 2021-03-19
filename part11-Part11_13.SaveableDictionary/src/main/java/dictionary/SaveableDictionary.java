package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionaryWords;
    private String fileName;

    public SaveableDictionary() {
        this.dictionaryWords = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionaryWords = new HashMap<>();
        this.fileName = file;
    }

    public void add(String words, String translation) {
        if (!dictionaryWords.containsKey(words)) {
            this.dictionaryWords.put(words, translation);
            this.dictionaryWords.put(translation, words);
        }
    }

    public String translate(String word) {
        return this.dictionaryWords.get(word);
    }

    public void delete(String word) {
        String translationToBeRemoved = translate(word);
        dictionaryWords.remove(word);
        dictionaryWords.remove(translationToBeRemoved);
    }

    public boolean load() {
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineParts = line.split(":");
                if (!lineParts[0].isEmpty() || !lineParts[0].isEmpty()) {
                    this.dictionaryWords.put(lineParts[0], lineParts[1]);
                    this.dictionaryWords.put(lineParts[1], lineParts[0]);
                }
            }
            return true;

        } catch (Exception e) {
            System.out.println("File reading error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter fileWriter = new PrintWriter(fileName);
            saveWords(fileWriter);
            fileWriter.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return false;

        }
    }

    private void saveWords(PrintWriter writer) throws IOException {

        List<String> allreadySaved = new ArrayList<>();

        dictionaryWords.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }
            String part = word + ":" + dictionaryWords.get(word);
            writer.println(part);
            allreadySaved.add(word);
            allreadySaved.add(dictionaryWords.get(word));
        });

    }

}
