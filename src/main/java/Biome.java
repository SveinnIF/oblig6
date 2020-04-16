public class Biome {
    private String type, planet;
    private double longitude, latitude;

    public Biome(String type, String planet, double longitude, double latitude) {
        this.type = type;
        this.planet = planet;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "On the planet " + planet + " in a " + type + " biome at these coordinates: longitude: " + longitude + ". latitude: " + latitude + ".";
    }
}
