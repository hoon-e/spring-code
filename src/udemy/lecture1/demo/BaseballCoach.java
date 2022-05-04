package udemy.lecture1.demo;

import udemy.lecture2.demo.FortuneService;

public class BaseballCoach implements Coach {

    // dependency를 위한 private 필드 정의
    private FortuneService fortuneService;

    // di를 위한 생성자를 정의
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "배팅 연습에 30분을 소비합니다.";
    }

    @Override
    public String getDailyFortune() {
        // fortuneService로 fortune을 가져온다.
        return fortuneService.getFortune();
    }
}
