package udemy.lecture1.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstDemoApp {
    public static void main(String[] args) {
        // Spring 설정 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Spring 컨테이너로부터 Bean을 반환
        // 여기를 보면, 알아서 필요한 dependency들을 전부 조합을 해서 생성이 된다.
        Coach myCoach = context.getBean("baseballCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        // Bean의 메서드를 호출
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        // 추가된 메서드를 호출
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        // Context를 종료
        context.close();
    }
}
