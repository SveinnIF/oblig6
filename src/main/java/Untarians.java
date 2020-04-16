import java.util.ArrayList;
import java.util.Comparator;
public class Untarians extends Animal{
    private int amountOfOrifices,observedSocialInteligence;
    private String toolUse,graspingAbility;

    public Untarians(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {
        super(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length);
        this.amountOfOrifices = amountOfOrifices;
        this.observedSocialInteligence = observedSocialInteligence;
        this.toolUse = toolUse;
        this.graspingAbility = graspingAbility;
    }

/*    public String mostOrifices(ArrayList<Untarians> untarians){
        return untarians.sort(Comparator.comparing(Untarians::mostOrifices));
    }*/

    @Override
    public String toString() {
        String mode;
        if(isCanFly()){
            mode = " it does have the ability to fly. ";
        }else if(isNeedsSubmersion()){
            mode = " it needs to be submerged in liquid. ";
        }else{
            mode = " it is land dwelling. ";
        }
        return getId() + " the " + getName() + " (" + getScienceName() + "). it is " + getColour() + " ." + mode + "it has " +  getAmountOfEyes() + " eyes and " +  getAmountOflegs() +
                " legs. it has a height of " + getHeight() + " meter and a length of " + getLength() + " meter. it has " +
                amountOfOrifices + " orifices. The social interligence it has is: " + observedSocialInteligence + ". Use of tools: " + toolUse + ", the subjects grasping ability is " + graspingAbility + ". ";
    }
}
