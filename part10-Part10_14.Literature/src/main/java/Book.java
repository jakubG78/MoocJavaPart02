
public class Book {

    private String name;
    private int recomendedAge;

    public Book(String name, int recomendedAge) {
        this.name = name;
        this.recomendedAge = recomendedAge;
    }

    public String getName() {
        return name;
    }

    public int getRecomendedAge() {
        return recomendedAge;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + recomendedAge + " year-olds or older)";
    }
}
