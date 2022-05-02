package udemy.lecture1.demo;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "배팅 연습에 30분을 소비합니다.";
    }
}
