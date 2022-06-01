package udemy.lecture8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // 매 요청 마다 새로운 인스턴스를 생성한다.
public class Hoone implements Human {

    private StudyService studyService;

    @Autowired
    @Qualifier("algorithmStudyServiceImpl")
    public void setStudyService(StudyService studyService) {
        this.studyService = studyService;
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
