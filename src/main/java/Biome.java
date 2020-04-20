public class Biome {
    private String type, planet;
    private double longitude, latitude;

    public Biome(String type, String planet, double longitude, double latitude) {
        this.type = type;
        this.planet = planet;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Biome() {
    }

    public void setAllBi(String type, String planet, double longitude, double latitude){
        setType(type);
        setPlanet(planet);
        setLongitude(longitude);
        setLatitude(latitude);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "On the planet " + planet + " in a " + type + " biome at these coordinates: longitude: " + longitude + ". latitude: " + latitude + ".";
    }
}
