import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Observation {
    private String observerName,picture,comments,timeObserved;
    private int amountObserved;
    private Animal animal;
    private Biome biome;

    public Observation(String observerName, Animal animal,Biome biome, String picture, String timeObserved, int amountObserved,  String comments) {
        this.observerName = observerName;
        this.picture = picture;
        this.comments = comments;
        this.timeObserved = timeObserved;
        this.amountObserved = amountObserved;
        this.animal = animal;
        this.biome = biome;
    }

    @Override
    public String toString() {
        return "on " + timeObserved + ", " + observerName + " observed " + animal  + biome + " comment: " + comments + " picture: " + picture + " amount observed: " + amountObserved;
    }
}
