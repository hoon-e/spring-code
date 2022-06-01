package udemy.lecture8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherHoone implements Human {

    private StudyService studyService;

    @Autowired
    AnotherHoone(@Qualifier("springStudyServiceImpl") StudyService studyService) {
        this.studyService = studyService;
    }

    @Override
    public String getName() {
        return "미래의 hoone 입니다.";
    }

    @Override
    public int getAge() {
        return 30;
    }

    @Override
    public String getJob() {
        return "더 성장한 Bigdata Platform engineer가 되었습니다.";
    }
}
