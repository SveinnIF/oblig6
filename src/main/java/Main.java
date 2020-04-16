import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String,Observation> observationList = new HashMap<>();
        HashMap<String, Kush> kushList = new HashMap<>();
        HashMap<String, Septans> septansList = new HashMap<>();
        HashMap<String,Untarians> untariansList =  new HashMap<>();
        HashMap<String,Biome> biomeList = new HashMap<>();

        biomeList.put("taterLand",new Biome("shroomforrest","galdadot",12345.543,123456.8765));
        untariansList.put("GOMP", new Untarians("GOMP","damberdober","snippsnoppdipperdopp","orange with green dots",false,
                false,4,3,1.5,0.5,7,46,"can use sticks as weapons","high"));
        kushList.put("sippdipp", new Kush("sippdipp","Jarrdkushner","Jepdrepidus","green with brown spots",false,false,
                13,8,0.5,1,true,"carnevore","slow","external, long range gramb gland","necrosis inducing",5));
        septansList.put("ORGALORG",new Septans("ORGALORG","Orgalorg","Orlogargigiusamatatius","yellow with brown stripes",true,
                false,2,4,1,2, "sometype","scalecollecion","bent",true,2));
        observationList.put("untarianObservation",new Observation("Svon", untariansList.get("GOMP"),biomeList.get("taterLand"),"pictureURL","24.3.2337",1,"it was eating"));
        System.out.println(observationList.get("untarianObservation"));
    }
}
