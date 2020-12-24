package ChapterFour.Eleven;

public class Film {

    private final String name;
    private final int ageRating;

    public String name() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
}
