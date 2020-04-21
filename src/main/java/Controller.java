import io.javalin.http.Context;
import java.util.HashMap;

public class Controller {
        private IrepositoryInterface animalRepository;

        public Controller(IrepositoryInterface animalRepository) {
            this.animalRepository = animalRepository;
        }

        public void getAllObservations(Context context){
            HashMap<String,Observation> allObservations = new HashMap<>(animalRepository.getObservationList());
            context.json(allObservations);
        }
}

