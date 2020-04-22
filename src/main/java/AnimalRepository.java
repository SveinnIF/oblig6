import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class AnimalRepository implements IrepositoryInterface {
    HashMap<String, Observation> observationList;
    HashMap<String, Kush> kushList;
    HashMap<String, Septans> septansList;
    HashMap<String, Untarians> untariansList;
    HashMap<String, Biome> biomeList;

    public AnimalRepository(HashMap<String, Observation> observationList, HashMap<String, Kush> kushList, HashMap<String, Septans> septansList, HashMap<String, Untarians> untariansList, HashMap<String, Biome> biomeList, String fileName) {
        this.observationList = observationList;
        this.kushList = kushList;
        this.septansList = septansList;
        this.untariansList = untariansList;
        this.biomeList = biomeList;

        registerUntarians("Himian","Hoganbog","niptipslippidipp","green with green stripes",true,false,4,6,2,3,3,50,"simple","low");
        registerBiome("Ankhank","grasslands","galdadot",6436.24,2345.43);
        makeObservation("Himian observation","Karl Kevin Kubheim",untariansList.get("Himian"),biomeList.get("Ankhank"),"picture","13.6.2338",2,"new animal found, looks like 2 animals at first but is actually connected. no idea why. observed with a child");
        System.out.println(Untarians.amountOfOrifices(untariansList));
        skrivTilJson(fileName, observationList);
        System.out.println(readFromFile(fileName));
    }


    public void skrivTilJson(String filnavn, HashMap<String, Observation> observationHashMap) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filnavn), observationHashMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  HashMap<String, Observation> readFromFile(String filePath) {
        HashMap<String, Observation> observationList = new HashMap<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<HashMap<String, Observation>> typeRef = new TypeReference<HashMap<String, Observation>>() {
            };
            observationList = objectMapper.readValue(new File(filePath), typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return observationList;
        //read and write methods were made with the help of this tutorial: https://www.baeldung.com/jackson-map
        //but mostly by example of the previous assignment. also got a little help from my friend Kim how pointed me in the right direction a couple of times (for example he told me i was looking at the wrong part of the tutorial when i got stuck at one point)
        //don't know how important it is to mention that my friend told me to look at the right place but im not taking any chances
    }


    @Override
    public HashMap<String, Observation> getObservationList() {
        return observationList;
    }

    @Override
    public void registerUntarians(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {
        untariansList.put(id,new Untarians(id, name,scienceName,colour,  canFly,  needsSubmersion,  amountOfEyes,  amountOflegs, height,  length,  amountOfOrifices, observedSocialInteligence, toolUse,graspingAbility));
        }

    @Override
    public void registerSeptans(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan) {
        septansList.put(id,new Septans(id, name,scienceName,colour,  canFly,  needsSubmersion,  amountOfEyes,  amountOflegs, height,  length,exoskeletonType, wingType, antennaType, wings, estimatedWingspan));
    }

    @Override
    public void registerKush(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {
        kushList.put(id,new Kush(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length, mobile, diet, walkingSpeed, formOfAcidGland, venomType, amountOfSporeSacks));
    }

    @Override
    public void updateUntarians(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {
        untariansList.get(originalId).setAllunt(id, name,scienceName,colour,  canFly,  needsSubmersion,  amountOfEyes,  amountOflegs, height,  length,  amountOfOrifices, observedSocialInteligence, toolUse,graspingAbility);
    }

    @Override
    public void updateSeptans(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan) {
        septansList.get(originalId).setAllSep(id, name,scienceName,colour,  canFly,  needsSubmersion,  amountOfEyes,  amountOflegs, height,  length,exoskeletonType, wingType, antennaType, wings, estimatedWingspan);
    }

    @Override
    public void updateKush(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {
        kushList.get(originalId).setAllKush(id, name, scienceName, colour, canFly, needsSubmersion, amountOfEyes, amountOflegs, height, length, mobile, diet, walkingSpeed, formOfAcidGland, venomType, amountOfSporeSacks);
    }

    @Override
    public void deleteUntarians(String id) {
        untariansList.remove(id);
        //forgot how to remove so i had to search for it, just took the first result. https://www.tutorialspoint.com/java/util/hashmap_remove.htm
    }

    @Override
    public void deleteSeptans(String id) {
        septansList.remove(id);
    }

    @Override
    public void deleteKush(String id) {
        kushList.remove(id);
    }

    @Override
    public void makeObservation(String name,String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments) {
        observationList.put(name, new Observation(name,observerName, animal,  biome,  picture,  timeObserved,  amountObserved,  comments));
    }

    @Override
    public void updateObservation(String name,String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments) {
        observationList.get(name).setAllObs(name,observerName, animal,  biome,  picture,  timeObserved,  amountObserved,  comments);
    }

    @Override
    public void deleteObservation(String name) {
        observationList.remove(name);
    }

    @Override
    public void registerBiome(String localName,String type, String planet, double longitude, double latitude) {
        biomeList.put(localName, new Biome(type,planet,latitude,latitude));
    }

    @Override
    public void updateBiome(String localName,String type, String planet, double longitude, double latitude) {
        biomeList.get(localName).setAllBi(type,planet,latitude,latitude);
    }

    @Override
    public void deleteBiome(String localName) {
        biomeList.remove(localName);
    }
}
