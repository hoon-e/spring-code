package udemy.lecture2.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecondDemoApp {
    public static void main(String[] args) {
        // spring config 파일 로딩
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // spring 컨테이너로부터 bean 호출
        // 이 안에서, 생성자와 setter 메서드 디펜던시가 모두 호출된다. println에서 확인할 수 있다.
        CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);

        // bean으로부터 메서드 호출
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        // spring context 종료
        applicationContext.close();
    }
}
