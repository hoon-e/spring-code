package udemy.lecture4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import udemy.lecture5.demo.NutritionService;

@Component
public class SwimmingCoach implements Coach {
    @Autowired
    @Qualifier("randomService")
    private NutritionService nutritionService;

    @Override
    public String getDailyWorkout() {
        return "박태환 선수처럼 열심히 훈련하세요.";
    }

    @Override
    public String getNutrition() {
        return nutritionService.getNutrition();
    }
}
