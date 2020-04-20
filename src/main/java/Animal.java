import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Untarians.class, name = "Untarians"),
        @JsonSubTypes.Type(value = Kush.class, name = "Kush"),
        @JsonSubTypes.Type(value = Septans.class, name = "Septans"),
})
public abstract class Animal {
    private String id,name,scienceName,colour;
    private boolean canFly,needsSubmersion;
    private int amountOfEyes,amountOflegs;
    private double height,length;

    public Animal(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length) {
        this.id = id;
        this.name = name;
        this.scienceName = scienceName;
        this.colour = colour;
        this.canFly = canFly;
        this.needsSubmersion = needsSubmersion;
        this.amountOfEyes = amountOfEyes;
        this.amountOflegs = amountOflegs;
        this.height = height;
        this.length = length;
    }

    public Animal() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void setNeedsSubmersion(boolean needsSubmersion) {
        this.needsSubmersion = needsSubmersion;
    }

    public void setAmountOfEyes(int amountOfEyes) {
        this.amountOfEyes = amountOfEyes;
    }

    public void setAmountOflegs(int amountOflegs) {
        this.amountOflegs = amountOflegs;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScienceName() {
        return scienceName;
    }

    public String getColour() {
        return colour;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isNeedsSubmersion() {
        return needsSubmersion;
    }

    public int getAmountOfEyes() {
        return amountOfEyes;
    }

    public int getAmountOflegs() {
        return amountOflegs;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }



}
