public class Septans extends Animal{
    private String exoskeletonType,wingType,antennaType;
    private boolean wings;
    private float estimatedWingspan;

    public Septans(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan) {
        super(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length);
        this.exoskeletonType = exoskeletonType;
        this.wingType = wingType;
        this.antennaType = antennaType;
        this.wings = wings;
        this.estimatedWingspan = estimatedWingspan;
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
        if(wings){
            mobility = " it has " + wingType + " wings. And an estimated wingspan on:" + estimatedWingspan + " meter.";
        }else{
            mobility = " it does not have wings.";
        }
        return getId() + " the " + getName() + " (" + getScienceName() + "). it is " + getColour() + " ." + mode + "it has " +  getAmountOfEyes() + " eyes and " +  getAmountOflegs() +
                " legs. it has a height of " + getHeight() + " meter and a length of " + getLength() + " meter. " + mobility + ". The type is exoskeleton it has is: " + exoskeletonType + " and the antenna are: " + antennaType + ". ";
    }
}
