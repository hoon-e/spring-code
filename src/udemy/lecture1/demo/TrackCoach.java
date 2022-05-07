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

    // 새로운 init 메서드와
    public void doStartupStuff() {
        System.out.println("TrackCoach: startup method - doStartupStuff.");
    }

    // 새로운 destroy 메서드를 생성한다.
    public void doShutdownStuff() {
        System.out.println("TrackCoach: shutdown method - doShutdownStuff.");
    }
}
