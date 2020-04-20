import java.util.HashMap;
public class Main {
    public static void main(String[] args){

        HashMap<String,Observation> observationList = new HashMap<>();
        HashMap<String, Kush> kushList = new HashMap<>();
        HashMap<String, Septans> septansList = new HashMap<>();
        HashMap<String,Untarians> untariansList =  new HashMap<>();
        HashMap<String,Biome> biomeList = new HashMap<>();

        biomeList.put("taterLand",new Biome("shroomforrest","galdadot",12345.543,123456.8765));
        //biomeList.put();
        untariansList.put("GOMP", new Untarians("GOMP","damberdober","snippsnoppdipperdopp","orange with green dots",false,
                false,4,3,1.5,0.5,7,46,"can use sticks as weapons","high"));
        untariansList.put("GRUBL",new Untarians("GRUBL","Talie","Dimdamdibbadab","brown with brown legstripes",false,false,3,3,5,1,6,20,"not observed","low"));
        kushList.put("sippdipp", new Kush("sippdipp","Jarrdkushner","Jepdrepidus","green with brown spots",false,false,
                13,8,0.5,1,true,"carnevore","slow","external, long range gramb gland","necrosis inducing",5));
        kushList.put("Klomp",new Kush("Klomp","Deathvines","Bitusropus","green",false,true,0,0,7,1,false,"carnevore","none","none","paralyzing",100));
        septansList.put("ORGALORG",new Septans("ORGALORG","Orgalorg","Orlogargigiusamatatius","yellow with brown stripes",true,
                false,2,4,1,2, "bonemold","scalecollecion","bent",true,2));
        septansList.put("Kampian", new Septans("Kampian","shrubcrawler","shrubicuscrawlicus","brown with lightbrown topcitin",false,false,2,6,0.5,5,"iron-chitin composit","none","straight",false,0));
        observationList.put("untarianObservation",new Observation("Svon", untariansList.get("GOMP"),biomeList.get("taterLand"),"https://media.discordapp.net/attachments/578228794939408384/701739929180569661/unknown.png?width=607&height=502","24.3.2337",1,"it was eating"));
        System.out.println(observationList.get("untarianObservation"));

        new AnimalRepository(observationList,kushList, septansList, untariansList,  biomeList,"observationCatalog");
        //jeg velger map for å ha dataene mine i fordi da slipper en del metoder som resultat av List. Med HashMap kan jeg bare skrive .get(nøkkelen) siden alt har en Id her uansett. det er base det beste valget synes jeg
        //i mean, HashMap was MADE for this kind of stuff


    }

}