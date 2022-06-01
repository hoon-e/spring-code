package udemy.lecture8;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SpringStudyServiceImpl implements StudyService {
    @Override
    public String getWhatAreYouDoing() {
        return "Spring 공부를 하고 있습니다.";
    }

    @Override
    public int getProgress() {
        return new Random().nextInt(101);
    }
}
