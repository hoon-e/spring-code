package udemy.lecture5.qualifier;

import org.springframework.stereotype.Component;
import udemy.lecture5.demo.NutritionService;

import java.util.Random;

@Component
public class RandomService implements NutritionService {
    String[] nutrition = {
            "vitamin C",
            "vitamin B",
            "vitamin B12",
            "vitamin D"
    };

    private Random rnd = new Random(nutrition.length);

    @Override
    public String getNutrition() {
        return nutrition[rnd.nextInt(nutrition.length-1)];
    }
}
