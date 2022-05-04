package udemy.lecture2.demo;

import udemy.lecture1.demo.Coach;

// Setter Injection 테스트를 위함
public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("argument가 없는 생성자의 동작 방식 살펴보기");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter 메서드 안의 동작 방식 살펴보기");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "크리켓은 한국에서 안 해요.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
