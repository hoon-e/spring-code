package udemy.lecture5.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.lecture4.demo.Coach;

public class AutowiredDemo {
    public static void main(String[] args) {
        // config 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // spring container로부터 bean 얻기
        Coach footballCoach = context.getBean("footballCoach", Coach.class);

        // setter injection
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // bean으로부터 메서드 실행
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getNutrition());

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getNutrition());

        // context 종료
        context.close();
    }
}
