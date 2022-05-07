package udemy.lecture4.demo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "박태환 선수처럼 열심히 훈련하세요.";
    }
}
