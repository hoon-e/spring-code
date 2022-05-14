package udemy.lecture4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import udemy.lecture5.demo.NutritionService;

@Component
public class TennisCoach implements Coach {
    @Autowired // Intellij는
    private NutritionService nutritionService;

    public TennisCoach() {
        System.out.println(">> TennisCoach : 기본 생성자를 호출한다.");
    }

//    setter method를 생성한다.
//    @Autowired
//    public void setNutritionService(NutritionService nutritionService) {
//        System.out.println(">> Setter Injection 수행 됩니다.");
//        this.nutritionService = nutritionService;
//    }

//    @Autowired
//    public void testSetterInjection(NutritionService nutritionService) {
//        System.out.println(">> Setter Injection 수행 됩니다.");
//        this.nutritionService = nutritionService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Tennis 열심히 치세요~!";
    }

    @Override
    public String getNutrition() {
        return nutritionService.getNutrition();
    }
}
