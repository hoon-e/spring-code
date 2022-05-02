package udemy.lecture1.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
    public static void main(String[] args) {
        // Spring 설정 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Spring 컨테이너로부터 Bean을 반환
        Coach myCoach = context.getBean("baseballCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        // Bean의 메서드를 호출
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        // Context를 종료
        context.close();
    }
}
