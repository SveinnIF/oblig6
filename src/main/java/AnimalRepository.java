import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class AnimalRepository implements repositoryInterface {
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
        skrivTilJson(fileName, observationList);
        System.out.println(readFromFile(fileName));
    }

    public static void skrivTilJson(String filnavn, HashMap<String, Observation> observationHashMap) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filnavn), observationHashMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Observation> readFromFile(String filePath) {
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
    }


    @Override
    public void registerUntarians(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {

    }

    @Override
    public void registerSeptans(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan) {

    }

    @Override
    public void registerKush(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {

    }

    @Override
    public void updateUntarians(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility) {

    }

    @Override
    public void updateSeptans(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan) {

    }

    @Override
    public void updateKush(String originalId, String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks) {

    }

    @Override
    public void deleteUntarians(String id) {

    }

    @Override
    public void deleteSeptans(String id) {

    }

    @Override
    public void deleteKush(String id) {

    }

    @Override
    public void makeObservation(String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments) {

    }

    @Override
    public void updateObservation(String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments) {

    }

    @Override
    public void deleteObservation(String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments) {

    }

    @Override
    public void registerBiome(String type, String planet, double longitude, double latitude) {

    }

    @Override
    public void updateBiome(String type, String planet, double longitude, double latitude) {

    }

    @Override
    public void deleteBiome(String type, String planet, double longitude, double latitude) {

    }
}
