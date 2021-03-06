public class Kush extends Animal{
    private boolean mobile;
    private String diet,walkingSpeed, formOfAcidGland,venomType;
    private int amountOfSporeSacks;

    public Kush(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {
        super(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length);
        this.mobile = mobile;
        this.diet = diet;
        this.walkingSpeed = walkingSpeed;
        this.formOfAcidGland = formOfAcidGland;
        this.venomType = venomType;
        this.amountOfSporeSacks = amountOfSporeSacks;
    }

    public Kush() {
    }

    public void setAllKush(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {
        setId(id);
        setName(name);
        setScienceName(scienceName);
        setColour(colour);
        setCanFly(canFly);
        setNeedsSubmersion(needsSubmersion);
        setAmountOfEyes(amountOfEyes);
        setAmountOflegs(amountOflegs);
        setHeight(height);
        setLength(length);
        setMobile(mobile);
        setDiet(diet);
        setWalkingSpeed(walkingSpeed);
        setFormOfAcidGland(formOfAcidGland);
        setVenomType(venomType);
        setAmountOfSporeSacks(amountOfSporeSacks);
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(String walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    public String getFormOfAcidGland() {
        return formOfAcidGland;
    }

    public void setFormOfAcidGland(String formOfAcidGland) {
        this.formOfAcidGland = formOfAcidGland;
    }

    public String getVenomType() {
        return venomType;
    }

    public void setVenomType(String venomType) {
        this.venomType = venomType;
    }

    public int getAmountOfSporeSacks() {
        return amountOfSporeSacks;
    }

    public void setAmountOfSporeSacks(int amountOfSporeSacks) {
        this.amountOfSporeSacks = amountOfSporeSacks;
    }

    @Override
    public String toString() {
        String mode;
        String mobility;
        if(isCanFly()){
            mode = " it does have the ability to fly. ";
        }else if(isNeedsSubmersion()){
            mode = " it needs to be submerged in liquid. ";
        }else{
            mode = " it is land dwelling. ";
        }
        if(mobile){
            mobility = " it has the ability to move by its own power and a walking speed of: " + walkingSpeed;
        }else{
            mobility = " it does not have the ability to move ny its own power";
        }
        return getId() + " the " + getName() + " (" + getScienceName() + "). it is " + getColour() + " ." + mode + "it has " +  getAmountOfEyes() + " eyes and " +  getAmountOflegs() +
                " legs. it has a height of " + getHeight() + " meter and a length of " + getLength() + " meter " + mobility + ". it has a diet of " + diet +
                ". The acid gland is: " + formOfAcidGland + " and the venom is: " + venomType + ". it has " + amountOfSporeSacks + "spore sacks.";
    }
}
