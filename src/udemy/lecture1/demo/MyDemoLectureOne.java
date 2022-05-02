package udemy.lecture1.demo;

public class MyDemoLectureOne {
    public static void main(String[] args) {
        // 객체 생성
        Coach ballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        // 객체 사용
        System.out.println(ballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
    }
}
