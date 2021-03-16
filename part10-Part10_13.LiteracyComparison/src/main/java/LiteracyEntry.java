
public class LiteracyEntry {

    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public LiteracyEntry(String gender, String country, int year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + year + "), " + gender + ", " + literacyPercent;
    }
}
