import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Untarians extends Animal implements Comparable{
    private int amountOfOrifices,observedSocialInteligence;
    private String toolUse,graspingAbility;

    public Untarians(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {
        super(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length);
        this.amountOfOrifices = amountOfOrifices;
        this.observedSocialInteligence = observedSocialInteligence;
        this.toolUse = toolUse;
        this.graspingAbility = graspingAbility;
    }

    public Untarians() {
    }

    public void setAllunt(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {
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
        setAmountOfOrifices(amountOfOrifices);
        setObservedSocialInteligence(observedSocialInteligence);
        setToolUse(toolUse);
        setGraspingAbility(graspingAbility);
        //the set all idea i got a while ago from my friend Kim, i thought it was a brilliant idea so im doing it here too
    }

    public int getAmountOfOrifices() {
        return amountOfOrifices;
    }

    public void setAmountOfOrifices(int amountOfOrifices) {
        this.amountOfOrifices = amountOfOrifices;
    }

    public int getObservedSocialInteligence() {
        return observedSocialInteligence;
    }

    public void setObservedSocialInteligence(int observedSocialInteligence) {
        this.observedSocialInteligence = observedSocialInteligence;
    }

    public String getToolUse() {
        return toolUse;
    }

    public void setToolUse(String toolUse) {
        this.toolUse = toolUse;
    }

    public String getGraspingAbility() {
        return graspingAbility;
    }

    public void setGraspingAbility(String graspingAbility) {
        this.graspingAbility = graspingAbility;
    }


    public static HashMap<String,Untarians> amountOfOrifices(HashMap<String,Untarians> untariansHashMap){
        List<Untarians> orificeNumber = new ArrayList<>(untariansHashMap.values());
        HashMap<String,Untarians> sortedByOrifice = new HashMap<>();

        orificeNumber.sort(Comparator.comparing(Untarians::getAmountOfOrifices));

        for (Untarians untarians : orificeNumber) {
            sortedByOrifice.put(untarians.getId(), untarians);
        }
        return sortedByOrifice;
        //https://stackoverflow.com/questions/780541/how-to-sort-a-hashmap-in-java
    }

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

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
