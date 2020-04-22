import java.util.HashMap;

public interface IrepositoryInterface {
    HashMap<String, Observation> getObservationList();
    void registerUntarians(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility);
    void registerSeptans(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan);
    void registerKush(String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks);
    void updateUntarians(String originalId,String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, int amountOfOrifices, int observedSocialInteligence, String toolUse, String graspingAbility);
    void updateSeptans(String originalId,String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, String exoskeletonType, String wingType, String antennaType, boolean wings, float estimatedWingspan);
    void updateKush(String originalId,String id, String name, String scienceName, String colour, boolean canFly, boolean needsSubmersion, int amountOfEyes, int amountOflegs, double height, double length, boolean mobile, String diet, String walkingSpeed, String formOfAcidGland, String venomType, int amountOfSporeSacks);
    void deleteUntarians(String id);
    void deleteSeptans(String id);
    void deleteKush(String id);
    void makeObservation(String name,String observerName, Animal animal, Biome biome, String picture, String timeObserved, int amountObserved, String comments);
    void updateObservation(String name,String observerName, Animal animal,Biome biome, String picture, String timeObserved, int amountObserved,  String comments);
    void deleteObservation(String name);
    void registerBiome(String localName,String type, String planet, double longitude, double latitude);
    void updateBiome(String localName,String type, String planet, double longitude, double latitude);
    void deleteBiome(String localName);
}
