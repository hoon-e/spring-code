package udemy.lecture3.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.lecture1.demo.Coach;

public class BeanScopeDemo {
    public static void main(String[] args) {
        // spring 설정 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // spring container로부터 bean 반환
        Coach coach = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);

        // 같은 bean인지를 체크
        // scope가 prototype이면 서로 다른 객체가 생성된다.
        boolean result = (coach == coach2);

        System.out.println("같은 객체를 가리키는지? => " + result);
        System.out.println("coach 객체의 메모리 위치 => " + coach);
        System.out.println("coach2 객체의 메모리 위치 => " + coach2);

        context.close();
    }
}
