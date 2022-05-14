package udemy.lecture4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import udemy.lecture5.demo.NutritionService;

@Component // bean id == @Component("footballCoach") 둘 다 똑같음
// 기본 Component 어노테이션은 클래스의 가장 첫글자를 소문자로 변환함
public class FootballCoach implements Coach {

    private NutritionService nutritionService;

    @Autowired // Autowired annotation
    public FootballCoach(NutritionService nutritionService) {
        this.nutritionService = nutritionService;
    }

    @Override
    public String getDailyWorkout() {
        return "손흥민 선수처럼 열심히 훈련하세요.";
    }

    @Override
    public String getNutrition() {
        return nutritionService.getNutrition();
    }
}
