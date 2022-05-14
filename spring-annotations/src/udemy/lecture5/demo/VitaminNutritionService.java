package udemy.lecture5.demo;

import org.springframework.stereotype.Component;

@Component
public class VitaminNutritionService implements NutritionService {
    @Override
    public String getNutrition() {
        return "오늘은 비타민 씨를 드세요.";
    }
}
