package udemy.lecture5.qualifier;

import org.springframework.stereotype.Component;
import udemy.lecture5.demo.NutritionService;

@Component
public class RealrealRandomService implements NutritionService {
    @Override
    public String getNutrition() {
        return "RealrealRandom";
    }
}
