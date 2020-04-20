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

    public Observation() {
    }

    public void setAllObs(String observerName, Animal animal,Biome biome, String picture, String timeObserved, int amountObserved,  String comments){
        setObserverName(observerName);
        setAnimal(animal);
        setBiome(biome);
        setPicture(picture);
        setTimeObserved(timeObserved);
        setAmountObserved(amountObserved);
        setComments(comments);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTimeObserved() {
        return timeObserved;
    }

    public void setTimeObserved(String timeObserved) {
        this.timeObserved = timeObserved;
    }

    public int getAmountObserved() {
        return amountObserved;
    }

    public void setAmountObserved(int amountObserved) {
        this.amountObserved = amountObserved;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Biome getBiome() {
        return biome;
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }

    @Override
    public String toString() {
        return "on " + timeObserved + ", " + observerName + " observed " + animal  + biome + " comment: " + comments + " picture: " + picture + " amount observed: " + amountObserved;
    }
}
