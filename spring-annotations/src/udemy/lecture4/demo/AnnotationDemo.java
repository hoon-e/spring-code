package udemy.lecture4.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        // config 파일 로딩
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // spring container로부터 bean 얻기
        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        Coach swimmingCoach = context.getBean("swimmingCoach", Coach.class);
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // bean으로부터 메서드 실행
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getNutrition());

        System.out.println(swimmingCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getNutrition());

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getNutrition());

        // context 종료
        context.close();
    }
}
