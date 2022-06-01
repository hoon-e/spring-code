package udemy.lecture8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
    public static void main(String[] args) {
        // load spring conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // load my classes
        Human hoon = context.getBean("hoone", Human.class);
        Human anotherHoon = context.getBean("hoone", Human.class);

        boolean result = (hoon == anotherHoon);

        System.out.println("Hoone가 서로 같나요? = " + result);

        System.out.println("Hoone의 메모리 위치가 어떻게 되나요? = " + hoon);

        System.out.println("Another Hoone의 메모리 위치가 어떻게 되나요? = " + anotherHoon);

        context.close();
    }
}
