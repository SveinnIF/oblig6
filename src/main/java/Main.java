import java.util.HashMap;
public class Main {
    public static void main(String[] args){

        HashMap<String,Observation> observationList = new HashMap<>();
        HashMap<String, Kush> kushList = new HashMap<>();
        HashMap<String, Septans> septansList = new HashMap<>();
        HashMap<String,Untarians> untariansList =  new HashMap<>();
        HashMap<String,Biome> biomeList = new HashMap<>();

        biomeList.put("taterLand",new Biome("shroomforrest","galdadot",12345.543,123456.8765));
        biomeList.put("tralleball", new Biome("shroomforrest","galdadot",2345.345,23456.765));
        biomeList.put("enFlaskeLim",new Biome("savanna","woophoop",2456.632,1345.6413));
        biomeList.put("blod",new Biome("dessert","woophoop",123456.765,2345.7654));
        biomeList.put("hemsedal",new Biome("lush green fields","gunnar sin planet",345134513451345.15515351,134213412341234.231251454351345135));
        biomeList.put("HAHAHAHAHA", new Biome("AAAAAAHAAHAHHAAA","HHHHHAAAAAAAAAAHAHAHAA",0.0,0.0));
        untariansList.put("GOMP", new Untarians("GOMP","damberdober","snippsnoppdipperdopp","orange with green dots",false,
                false,4,3,1.5,0.5,7,46,"can use sticks as weapons","high"));
        untariansList.put("GRUBL",new Untarians("GRUBL","Talie","Dimdamdibbadab","brown with brown legstripes",false,false,3,3,5,1,6,20,"not observed","low"));
        kushList.put("sippdipp", new Kush("sippdipp","Jarrdkushner","Jepdrepidus","green with brown spots",false,false,
                13,8,0.5,1,true,"carnevore","slow","external, long range gramb gland","necrosis inducing",5));
        kushList.put("Klomp",new Kush("Klomp","Deathvines","Bitusropus","green",false,true,0,0,7,1,false,"carnevore","none","none","paralyzing",100));
        septansList.put("ORGALORG",new Septans("ORGALORG","Orgalorg","Orlogargigiusamatatius","yellow with brown stripes",true,
                false,2,4,1,2, "bonemold","scalecollecion","bent",true,2));
        septansList.put("Kampian", new Septans("Kampian","shrubcrawler","shrubicuscrawlicus","brown with lightbrown topcitin",false,false,2,6,0.5,5,"iron-chitin composit","none","straight",false,0));
        observationList.put("GOMP observation",new Observation("Svon", untariansList.get("GOMP"),biomeList.get("taterLand"),"https://media.discordapp.net/attachments/578228794939408384/701739929180569661/unknown.png?width=607&height=502","24.3.2337",1,"it was eating"));
        observationList.put("GRUBL observation", new Observation("Bærg Bjørnar Birtleby",untariansList.get("GRUBL"),biomeList.get("tralleball"),"https://discordapp.com/channels/@me/578228794939408384/701740078975811604","24.11.2337",1,"my god what a beauty, those legs are to die for"));
        observationList.put("sippidipp observation", new Observation("hans-henning bjørrebill",kushList.get("sippdipp"),biomeList.get("enFlaskeLim"),"https://media.discordapp.net/attachments/578228794939408384/701741108748615760/unknown.png","12.12.2337",5,"now thise are some scary plants"));
        observationList.put("Klomp observation", new Observation("Gjens Gjørerett",kushList.get("Klomp"),biomeList.get("blod"),"https://media.discordapp.net/attachments/578228794939408384/701740878720532540/unknown.png?width=450&height=502","2.2.2338",12,"seem catching other swiming animals and eating them with their long mouth arms"));
        observationList.put("ORGALORG",new Observation("HARRY HOLE",kushList.get("ORGALORG"),biomeList.get("hemsedal"),"https://media.discordapp.net/attachments/578228794939408384/701739812297900092/unknown.png","23.523.3425",500,"THEY ARE EVERYWHERE! THEY ARE EATING FRANK! MY GOD THE HUMANITY!"));
        observationList.put("Kampian observation", new Observation("søpple jan bergstrøm",septansList.get("Kampian"),biomeList.get("HAHAHAHAHA"),"jeg hadde bilde av denne også, var liksom en tusenben greie men da må jeg slå på store pc'n igjen fordi jeg glemte å sende den over og det gidder jeg ikke nå. men det var vel ikke så viktig i oppgaven uansett","12.65.7654",24,"real cool beans these buggers are, wouldn'da lovva ben etin bya onea dam"));

        new AnimalRepository(observationList,kushList, septansList, untariansList,  biomeList,"observationCatalog");
        //jeg velger map for å ha dataene mine i fordi da slipper en del metoder som resultat av List. Med HashMap kan jeg bare skrive .get(nøkkelen) siden alt har en Id her uansett. det er base det beste valget synes jeg
        //i mean, HashMap was MADE for this kind of stuff


    }

}