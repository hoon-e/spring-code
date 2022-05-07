package udemy.lecture3.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.lecture1.demo.Coach;

public class BeanLifeCycleDemo {
    public static void main(String[] args) {
        // spring 설정 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // spring container로부터 bean 반환
        Coach coach = context.getBean("trackCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
