package udemy.lecture1.demo;

import udemy.lecture2.demo.FortuneService;

public class TrackCoach implements Coach {
    // dependency를 위한 private 필드 정의
    private FortuneService fortuneService;

    // di를 위한 생성자를 정의
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "열심히 뛰어라~";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
