package udemy.lecture8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Hoone implements Human {

    private StudyService studyService;

    @Autowired
    @Qualifier("algorithmStudyServiceImpl")
    public void setStudyService(StudyService studyService) {
        this.studyService = studyService;
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> Hoone: inside of doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> Hoone: inside of doMyCleanupStuff()");
    }

    @Override
    public String getName() {
        return "hoone 입니다.";
    }

    @Override
    public int getAge() {
        return 29;
    }

    @Override
    public String getJob() {
        return "I'm junior Bigdata platfrom engineer";
    }
}
