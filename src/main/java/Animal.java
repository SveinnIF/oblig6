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
